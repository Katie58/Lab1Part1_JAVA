
package deliver1;
import java.util.Scanner;

public class WhatToEat {

	public static void main(String[] args) {	
		Scanner scnr = new Scanner(System.in);	
		String input = "";
		////////////declare required variables
		String eventType = "invalid";
		String result;
		int partySize;
		
		///////////////////////////////////initialize and check eventType
		System.out.print("Enter event type (casual, semi-formal, formal):  ");
		do {
			input = scnr.nextLine().toLowerCase();
			if (input.equals("casual") || input.equals("semi-formal") || input.equals("formal")) {
				eventType = input;
				input = "";
			}
			else {
				System.out.print("INVALID ENTRY TRY AGAIN...  ");
				input = "invalid";
			}
		}
		while (input.equals("invalid"));
		///////////////////////////////////initialize and check partySize
		System.out.print("Enter party size:  ");
		do {
			partySize = scnr.nextInt();
			if ((partySize > 0) && (partySize < Integer.MAX_VALUE)) {
				input = "";
			}
			else {
				System.out.print("INVALID ENTRY TRY AGAIN...  ");
				input = "invalid";
			}
		}
		while (input.equals("invalid"));
		
		//close scanner
		scnr.close();
		
		////////////////////////////////////////////////initialize result
		result = "Since you’re hosting a " + eventType + " event for " + partySize + " participant(s), ";
		
		//////////////////concatenate result with meal & prep suggestions
		switch(eventType) {
		case "casual":
			result = result.concat("you should serve sandwiches prepared ");
			break;
		case "semi-formal":
			result = result.concat("you should serve fried chicken prepared ");
			break;
		case "formal":
			result = result.concat("you should serve chicken parmesan prepared ");
			break;
		}
		if (partySize == 1) {
			result = result.concat("in the microwave.");
		}
		else if (partySize < 13) {
			result = result.concat("in your kitchen.");
		}
		else {
			result = result.concat("by a caterer.");
		}
		
		///////////////////////////////////////////////////display result
		System.out.println(result);
	}
}
