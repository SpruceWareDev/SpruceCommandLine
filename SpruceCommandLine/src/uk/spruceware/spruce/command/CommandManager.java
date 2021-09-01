package uk.spruceware.spruce.command;

import java.util.concurrent.CopyOnWriteArrayList;

import uk.spruceware.spruce.command.impl.CommandsCommand;

public class CommandManager {

	private static CopyOnWriteArrayList<Command> commands;
	
	public CommandManager() {
		commands = new CopyOnWriteArrayList<>();
		
		addCommand(new CommandsCommand());
	}
	
	public void addCommand(Command c) {
		commands.add(c);
	}
	
	public static CopyOnWriteArrayList<Command> getCommands() {
		return commands;
	}
}
