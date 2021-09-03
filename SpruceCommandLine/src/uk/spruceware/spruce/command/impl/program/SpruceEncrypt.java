package uk.spruceware.spruce.command.impl.program;

import java.util.Scanner;

import uk.spruceware.spruce.command.Command;
import uk.spruceware.spruce.util.NumberUtils;

public class SpruceEncrypt extends Command{

	public static Scanner sc = new Scanner(System.in);
	
	public SpruceEncrypt() {
		super("SpruceEncrypt", "Program that can encrypt and decrypt strings.", sc);
	}
	
	public void onType(String cmd) {
		System.out.println("Enterted SpruceEncrypt! Type help for command help");
		handleInput();
	}
	
	public void handleInput() {
		System.out.print("SPRCENCRYPT >");
		// reads console for next entered command
		String nextCommand = sc.nextLine();
		// splits the command into separate commands
		String[] args = nextCommand.split(" ");
		if(args[0] == null) {
			System.out.println("You must enter something!");
			handleInput();
		}
		if(args[0].toLowerCase().equals("exit")) {
			end();
		}
		if(args[0].toLowerCase().equals("help")) {
			help();
			handleInput();
		}
		if(args[0].toLowerCase().equals("simple")) {
			simpleEncryption(args);
			handleInput();
		}
	}
	
	public void simpleEncryption(String[] args) {
		System.out.print("SPRCENCRYPT >");
		String eorc = "";
		// checks if first argument is not null
		if(args[1].equals(null)) {
			System.out.println("Please specify encrypt or decrypt!");
			handleInput();
		}else {
			eorc = args[1];
		}
		
		// encrypt code
		if(eorc.toLowerCase().equals("encrypt")){
			// creates a key variable and parses the integer from the original string inputed
			int key = NumberUtils.parseInt(args[2]);
			// checks if the integer is null
			if(key == 0) {
				System.out.println("You must enter a valid key");
				handleInput();
			}
			
			//creates startString variable that is set to user inputed string
			String startString = "";
			// checks if fourth argument is not null
			if(args[3] == null) {
				System.out.println("You must enter a string to encrypt!");
				handleInput();
			}else {
				startString = args[3];
			}
			
			// creates output string (encrypted) and also tells the user
			String outputString = encryptStringSimple(startString, key);
			System.out.println("Enrypted String : " + outputString);
			System.out.println("Key : " + key);
			handleInput();
		}
		
		// decrypt code
		
		
		if(eorc.toLowerCase().equals("encrypt")){
			// creates a key variable and parses the integer from the original string inputed
			int key = NumberUtils.parseInt(args[2]);
			// checks if the integer is null
			if(key == 0) {
				System.out.println("You must enter a valid key");
				handleInput();
			}
			
			//creates startString variable that is set to user inputed string
			String startString = "";
			// checks if fourth argument is not null
			if(args[3] == null) {
				System.out.println("You must enter a string to decrypt!");
				handleInput();
			}else {
				startString = args[3];
			}
			
			// creates output string (decrypted) and also tells the user
			String outputString = decryptStringSimple(startString, key);
			System.out.println("Decrypted String : " + outputString);
			System.out.println("Key : " + key);
			handleInput();
		}
	}
	
	public void help() {
		System.out.println("Help");
		System.out.println("Simple Encryption : simple <key> <string you want encrypting>");
		System.out.println("Advanced Encryption : *NOT DONE YET*");
	}
	
	// Simple encryption
	
    public String encryptStringSimple(String s, int key){
        String result = "";
        String text = s;
        char[] startChars = text.toCharArray();
        for(char c : startChars){
            c += key;
            result = result + c;
        }
        return result;
    }

    public String decryptStringSimple(String s, int key){
        String result = "";
        String text = s;
        char[] startChars = text.toCharArray();
        for(char c : startChars){
            c -= key;
            result = result + c;
        }
        return result;
    }
}
