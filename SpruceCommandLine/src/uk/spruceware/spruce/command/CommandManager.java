package uk.spruceware.spruce.command;

import java.util.ArrayList;

import uk.spruceware.spruce.command.impl.basic.CommandsCommand;
import uk.spruceware.spruce.command.impl.basic.HelpCommand;
import uk.spruceware.spruce.command.impl.basic.QuitCommand;

public class CommandManager {

	private ArrayList<Command> commands;
	
	public CommandManager() {
		commands = new ArrayList<>();
		
		commands.add(new CommandsCommand());
		commands.add(new HelpCommand());
		commands.add(new QuitCommand());
	}
	
	public ArrayList<Command> getCommands() {
		return commands;
	}
	
	public Command getCommandByName(String name) {
		for(Command c : commands) {
			if(c.name.equalsIgnoreCase(name)) {
				return c;
			}
		}
		return new CommandsCommand();
	}
}
