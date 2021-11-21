package org.andrei.menus;

public class MenuOne extends Menu {

    public void  displayMenu() {
        StringBuilder menuBuilder = new StringBuilder("Menu One\n");
        menuBuilder.append("=========\n")
                .append("0. Main Menu\n")
                .append("2. Menu two\n");
        System.out.println(menuBuilder);
    }
}