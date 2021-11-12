package org.andrei.menus.services;

import org.andrei.menus.dtos.CSVDTO;
import org.andrei.menus.mem_db.XMLMemDB;
import org.andrei.menus.mem_db.api.MemDB;
import org.andrei.menus.mem_db.api.XMLRepository;
import org.andrei.menus.mem_db.entities.XMLEntity;
import org.andrei.menus.mem_db.entities.api.Entity;

import java.util.List;

public class XMLService implements ActionService{
    private Entity xmlEntity;
    private XMLRepository xmlMemDB;

    public void setXmlMemDB(XMLRepository xmlMemDB) {
        this.xmlMemDB = xmlMemDB;
    }

    public void setXmlEntity(Entity xmlEntity) {
        this.xmlEntity = xmlEntity;
    }

    public void writeXMLFile(CSVDTO dtoFile) {
        List<String> csvItems = dtoFile.getCsvList();
        for(String csvItem : csvItems) {
            xmlEntity.setCSVItem(csvItem);
            xmlMemDB.save(xmlEntity);
        }
    }

    @Override
    public void action() {
        System.out.println("XML SERVICE");
    }
}
