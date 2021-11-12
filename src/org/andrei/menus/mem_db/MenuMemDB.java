package org.andrei.menus.mem_db;

import org.andrei.menus.Menu;
import org.andrei.menus.mem_db.api.MenuRepository;

import java.util.ArrayList;

public class MenuMemDB implements MenuRepository {
    private final ArrayList<Menu> menuList;

    public MenuMemDB() {
        menuList = new ArrayList<>();
    }

    public void save(Menu menu) {
        menuList.add(menu);
    }


    public int getMenuListSize() {
        return menuList.size();
    }

    public Menu getMenu(int index) {
        return menuList.get(index);
    }

}
