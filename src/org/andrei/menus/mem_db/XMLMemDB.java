package org.andrei.menus.mem_db;

import org.andrei.menus.MainMenu;
import org.andrei.menus.Menu;
import org.andrei.menus.mem_db.api.MemDB;
import org.andrei.menus.mem_db.api.XMLRepository;
import org.andrei.menus.mem_db.entities.XMLEntity;
import org.andrei.menus.mem_db.entities.api.Entity;

import java.util.ArrayList;
import java.util.List;

public class XMLMemDB implements XMLRepository {
    private List<Entity> xmlEntities;

    public XMLMemDB() {
        xmlEntities = new ArrayList<>();
    }

    @Override
    public void save(Entity entity) {
        xmlEntities.add(entity);
    }
}
