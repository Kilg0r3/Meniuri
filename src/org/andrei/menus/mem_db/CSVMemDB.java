package org.andrei.menus.mem_db;

import org.andrei.menus.MainMenu;
import org.andrei.menus.Menu;
import org.andrei.menus.mem_db.api.CSVRepository;
import org.andrei.menus.mem_db.api.MemDB;
import org.andrei.menus.mem_db.entities.api.Entity;

import java.util.ArrayList;
import java.util.List;

public class CSVMemDB implements CSVRepository {
    private List<String> csvItems;

    public CSVMemDB() {
        csvItems = new ArrayList<>();
    }

    public List<String> getCsvItems() {
        return csvItems;
    }


    public void save(String csvItem) {
        csvItems.add(csvItem);
    }

}
