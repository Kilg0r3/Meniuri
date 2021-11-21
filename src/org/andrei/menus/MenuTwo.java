package org.andrei.menus;

public class MenuTwo extends Menu {

    public void displayMenu() {
        StringBuilder menuBuilder = new StringBuilder("Menu two\n");
        menuBuilder.append("=========\n")
                .append("0. Main Menu\n")
                .append("1. Menu One\n");
        System.out.println(menuBuilder);
    }
}