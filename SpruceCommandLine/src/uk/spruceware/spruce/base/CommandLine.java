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
		String nextCommand;
		nextCommand = consoleScanner.nextLine();
		if(commandManager.getCommands().contains(commandManager.getCommandByName(nextCommand))) {
			Command c = commandManager.getCommandByName(nextCommand);
			c.onType();
		}else {
			System.out.println("Command Not Found!");
			handleCommands();
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
