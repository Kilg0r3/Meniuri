package org.andrei.menus;

import org.andrei.menus.services.ActionService;

public class MenuOne extends Menu {

    private StringBuilder menuBuilder;

    public MenuOne() {
        menuBuilder = new StringBuilder();
    }

    public void  displayMenu() {
       menuBuilder.append("Menu One\n")
                .append("=========\n")
                .append("0. Main Menu\n")
                .append("2. Menu two\n");
        System.out.println(menuBuilder.toString());
        ActionService actionService = getActionService();
        actionService.action();
    }
}