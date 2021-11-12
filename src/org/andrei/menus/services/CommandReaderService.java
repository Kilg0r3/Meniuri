package org.andrei.menus.services;

import java.util.Scanner;

public class CommandReaderService {
    private Scanner sc;

    public CommandReaderService() {
        sc = new Scanner(System.in);
    }

    public int readTerminalCommand() {
        int command = sc.nextInt();
        sc.nextLine();
        return command;
    }
}
