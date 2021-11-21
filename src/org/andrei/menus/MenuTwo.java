package org.andrei.menus;

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
        System.out.println(menuBuilder);
    }
}