package uk.spruceware.spruce.command.impl.basic;

import java.util.Scanner;

import uk.spruceware.spruce.base.CommandLine;
import uk.spruceware.spruce.command.Command;
import uk.spruceware.spruce.command.CommandManager;

public class CommandsCommand extends Command{
	
	public static Scanner sc = new Scanner(System.in);
	
	public CommandsCommand() {
		super("Commands", "Shows all command Line Commands", sc);
	}
	
	@Override
	public void onType() {
		System.out.println("Current Commands :");
		CommandManager commandManager = CommandLine.getCommandsManager();
		for(Command c : commandManager.getCommands()) {
			System.out.println("-" + c.getName());
		}
		end();
	}
}
