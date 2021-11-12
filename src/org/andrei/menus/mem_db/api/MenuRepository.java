package org.andrei.menus.mem_db.api;

import org.andrei.menus.Menu;

public interface MenuRepository {
    public void save(Menu menu);
    public int getMenuListSize();
    public Menu getMenu(int command);
}
