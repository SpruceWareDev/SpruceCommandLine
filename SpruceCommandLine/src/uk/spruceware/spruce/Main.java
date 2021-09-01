package uk.spruceware.spruce;

import uk.spruceware.spruce.base.CommandLine;

public class Main {

	public static void main(String[] args) {
		System.out.println("Started " + CommandLine.name + ". Current version " + CommandLine.version);
		System.out.println("Welcome to Spruce Command Line! You can type commands for a list of commands.");
		new CommandLine();
	}
}
