package org.andrei.menus;

public class MainMenu extends Menu {

	public void displayMenu() {
		StringBuilder menuBuilder = new StringBuilder("Main Menu\n");
		menuBuilder.append("=========\n")
				.append("1. Menu One\n")
				.append("2. Menu two\n");
		System.out.println(menuBuilder);
	}
}