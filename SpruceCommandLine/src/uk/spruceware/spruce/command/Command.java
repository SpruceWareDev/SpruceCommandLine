package uk.spruceware.spruce.command;

import java.util.Scanner;

import uk.spruceware.spruce.base.CommandLine;

public class Command {
	
	public String name;
	public String description;
	public Scanner cmdScanner;
	
	public Command(String name, String description, Scanner sc) {
		this.name = name;
		this.description = description;
		this.cmdScanner = sc;
	}
	
	public void onType() {
		CommandLine.setScanner(cmdScanner);
	}
	
	public void onFinish() {
		CommandLine.setScanner(CommandLine.consoleScanner);
		new CommandLine();
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
}
