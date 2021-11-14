package org.andrei.menus.services;

import org.andrei.menus.dtos.CSVDTO;
import org.andrei.menus.mem_db.CSVMemDB;
import org.andrei.menus.mem_db.MenuMemDB;

public class XMLProducerService {
    private CSVService csvService;
    private XMLService xmlService;
    private MenuService menuService;

    public XMLProducerService() {
        csvService = new CSVService();
        csvService.setCsvMemDB(new CSVMemDB());
        xmlService = new XMLService();
        menuService = new MenuService();
        menuService.setMenuDB(new MenuMemDB());
        menuService.setCommReader(new CommandReaderService());
    }

    public void produceXML() {
        menuService.menu();
        //csvService.loadCSVFile();
        CSVDTO csvdto = csvService.processCSVFile();
        xmlService.writeXMLFile(csvdto);
    }
}
