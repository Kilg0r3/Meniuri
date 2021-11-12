package org.andrei.menus;

import org.andrei.menus.services.ActionService;

public class MainMenu extends Menu {
	private StringBuilder menuBuilder;

	public MainMenu() {
		menuBuilder = new StringBuilder();
	}

	public void displayMenu() {
		menuBuilder.append("Main Menu\n")
				.append("=========\n")
				.append("1. Menu One\n")
				.append("2. Menu two\n");
		System.out.println(menuBuilder.toString());
		ActionService actionService = getActionService();
		actionService.action();
	}
}