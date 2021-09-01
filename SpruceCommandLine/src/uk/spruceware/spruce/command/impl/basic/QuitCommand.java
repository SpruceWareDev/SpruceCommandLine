package uk.spruceware.spruce.command.impl.basic;

import java.util.Scanner;

import uk.spruceware.spruce.command.Command;

public class QuitCommand extends Command{

	public static Scanner sc = new Scanner(System.in);
	
	public QuitCommand() {
		super("Quit", "Exits the command line.", sc);
	}
	
	@Override
	public void onType() {
		System.exit(0);
	}
}
