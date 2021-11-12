package org.andrei.menus.services;

import org.andrei.menus.dtos.CSVDTO;
import org.andrei.menus.mem_db.CSVMemDB;
import org.andrei.menus.mem_db.api.CSVRepository;

public class CSVService implements ActionService {
    private CSVRepository csvMemDB;

    public void setCsvMemDB(CSVRepository csvMemDB) {
        this.csvMemDB = csvMemDB;
    }

    public void loadCSVFile() {
        // TO DO
        System.out.println("CSV SERVICE");
    }

    public CSVDTO processCSVFile() {
        CSVDTO csvdto = new CSVDTO();
        csvdto.setCsvList(csvMemDB.getCsvItems());
        return csvdto;
    }

    @Override
    public void action() {
        loadCSVFile();
    }
}
