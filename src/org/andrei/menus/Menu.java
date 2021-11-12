package org.andrei.menus;

import org.andrei.menus.services.ActionService;

public abstract class Menu{
	private ActionService actionService;
	public abstract void displayMenu();

	public void setActionService(ActionService actionService) {
		this.actionService = actionService;
	}

	public ActionService getActionService() {
		return actionService;
	}
}

