package uk.spruceware.spruce.command.impl.basic;

import java.util.Scanner;

import uk.spruceware.spruce.base.CommandLine;
import uk.spruceware.spruce.command.Command;
import uk.spruceware.spruce.command.CommandManager;

public class HelpCommand extends Command{

	public static Scanner sc = new Scanner(System.in);
	
	public HelpCommand() {
		super("Help", "Helps the user with different commands.", sc);
	}
	
	@Override
	public void onType(String commandTyped) {
		System.out.println("Commands and there use :");
		CommandManager commandManager = CommandLine.getCommandsManager();
		for(Command c : commandManager.getCommands()) {
			System.out.println("-" + c.name + " : " + c.description);
		}
		end();
	}
}
