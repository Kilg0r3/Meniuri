package org.andrei.menus.services;

import org.andrei.menus.dtos.CSVDTO;

public class XMLProducerService {
    private CSVService csvService;
    private XMLService xmlService;
    private MenuService menuService;

    public XMLProducerService() {
        csvService = new CSVService();
        xmlService = new XMLService();
        menuService = new MenuService();
    }

    public void produceXML() {
        menuService.menu();
        //csvService.loadCSVFile();
        CSVDTO csvdto = csvService.processCSVFile();
        xmlService.writeXMLFile(csvdto);
    }
}
