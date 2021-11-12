package org.andrei.menus.services;

import org.andrei.menus.*;
import org.andrei.menus.mem_db.MenuMemDB;
import org.andrei.menus.mem_db.api.MemDB;
import org.andrei.menus.mem_db.api.MenuRepository;

public class MenuService implements ActionService{
    private MenuRepository menuDB;
    private CommandReaderService commReader;

    public void setMenuDB(MenuRepository menuDB) {
        this.menuDB = menuDB;
    }

    public void setCommReader(CommandReaderService commReader) {
        this.commReader = commReader;
    }

    public void chooseOption() {
        int comm = commReader.readTerminalCommand();
        if(comm < menuDB.getMenuListSize()) {
            Menu item = menuDB.getMenu(comm);
            item.displayMenu();
            item.getActionService().action();
            chooseOption();
        } else {
            System.out.println("Invalid comm");
        }
    }

    public void populateMenuList() {
        Menu mainMenu = new MainMenu();
        mainMenu.setActionService(new CSVService());

        Menu menuOne = new MenuOne();
        menuOne.setActionService(new XMLService());

        Menu menuTwo = new MenuTwo();
        menuTwo.setActionService(new MenuService());

        menuDB.save(mainMenu);
        menuDB.save(menuOne);
        menuDB.save(menuTwo);

        menuDB.getMenu(0).displayMenu();
    }

    public void menu() {
        populateMenuList();
        chooseOption();
    }

    @Override
    public void action() {
        System.out.println("MENU SERVICE");
    }
}
