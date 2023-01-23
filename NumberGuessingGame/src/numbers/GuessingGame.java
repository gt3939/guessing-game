package numbers;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	static int myGuess = 0; 
	static int upper = 0;
	
	public static void main(String[] args) {
		ranNum();
		compareValues();	
	}
	
	// retrieve the players guess
	static int userInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("Please choose a number between 1 and 10: ");
		try {
			myGuess = input.nextInt();
		}catch (InputMismatchException e) {
			//System.out.println("You've chosen an incorrect data type. Please select an integer from 1 to 10.");
		}
			switch(myGuess) {
				case 1 : System.out.println("You've guessed 1.");
					break;
				case 2 : System.out.println("You've guessed 2.");
					break;
				case 3: System.out.println("You've guessed 3.");
					break;
				case 4 : System.out.println("You've guessed 4.");
					break;
				case 5 : System.out.println("You've guessed 5.");
					break;
				case 6 : System.out.println("You've guessed 6.");
					break;
				case 7 : System.out.println("You've guessed 7.");
					break;
				case 8 : System.out.println("You've guessed 8.");
					break;
				case 9 : System.out.println("You've guessed 9.");
					break;
				case 10 : System.out.println("You've guessed 10.");
					break;
				default: System.out.println("Invalid Entry: Please pick a number between 1 and 10.");
			}
		return myGuess;
	}
			
	
	// Generate a random number
	static int ranNum() {
		Random r = new Random();
		upper = r.nextInt(1, 11);
		//System.out.print("Random number: " + upper);
		return upper;
	}
	
	
		// compare user input to random number generated & notify user of outcome.
	
	
	static void compareValues() {
		do {
			userInput();
			if(upper != myGuess) {System.out.println("Incorrect, Please Try Again!");}
		}while(upper != myGuess);
		
		if(upper == myGuess) {
			System.out.println("Correct!");
			System.exit(0);	
		}
	}
}
