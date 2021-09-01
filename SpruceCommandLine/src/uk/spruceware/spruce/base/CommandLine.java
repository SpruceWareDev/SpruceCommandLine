package uk.spruceware.spruce.base;

import java.util.Scanner;

import uk.spruceware.spruce.command.Command;
import uk.spruceware.spruce.command.CommandManager;

public class CommandLine {

	public static Scanner consoleScanner;
	public static String name = "Spruce Command Line", version = "0.0.1";
	private static CommandManager commandManager;
	
	public CommandLine() {
		consoleScanner = new Scanner(System.in);
		commandManager = new CommandManager();
		handleCommands();
	}
	
	public static void handleCommands() {
		System.out.print(">");
		String nextCommand = consoleScanner.nextLine();
		for(Command c : CommandManager.getCommands()) {
			if(nextCommand.equalsIgnoreCase(c.name)) {
				c.onType();
			}else {
				System.out.println("Unknown Command. Try Running Commands To See Commands!");
				handleCommands();
			}
		}
	}
	
	public Scanner getConsoleScanner() {
		return consoleScanner;
	}
	
	public static void setScanner(Scanner s) {
		consoleScanner = s;
	}
	
	public static CommandManager getCommandsManager() {
		return commandManager;
	}
}
