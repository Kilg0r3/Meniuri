package org.andrei.menus.mem_db.entities;

import org.andrei.menus.mem_db.entities.api.Entity;

public class XMLEntity implements Entity {
    private String CSVItem;

    public String getCSVItem() {
        return CSVItem;
    }

    public void setCSVItem(String CSVItem) {
        this.CSVItem = CSVItem;
    }
}
