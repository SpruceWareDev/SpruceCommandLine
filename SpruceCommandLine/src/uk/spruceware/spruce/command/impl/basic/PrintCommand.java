package uk.spruceware.spruce.command.impl.basic;

import java.util.Arrays;
import java.util.Scanner;

import uk.spruceware.spruce.command.Command;

public class PrintCommand extends Command{

	public static Scanner sc = new Scanner(System.in);
	
	public PrintCommand() {
		super("Print", "Prints some text to the screen.", sc);
	}
	
	public void onType(String commandTyped) {
		String[] args = commandTyped.split(" ", 2);
		System.out.println(args[1]);
		end();
	}
}
