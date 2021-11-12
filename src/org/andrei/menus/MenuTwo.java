package org.andrei.menus;

import org.andrei.menus.services.ActionService;

public class MenuTwo extends Menu {
    private StringBuilder menuBuilder;

    public MenuTwo() {
        menuBuilder = new StringBuilder();
    }
    public void displayMenu() {
        menuBuilder.append("Menu two\n")
                .append("=========\n")
                .append("0. Main Menu\n")
                .append("1. Menu One\n");
        System.out.println(menuBuilder.toString());
        ActionService actionService = getActionService();
        actionService.action();
    }
}