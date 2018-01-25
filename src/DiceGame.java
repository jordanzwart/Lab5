import java.util.Scanner;


/*
 * Ask the user to enter the number of sides for a pair of dice
 * Promt the user to roll the dice
 * "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again
 * Use Static methods to implement the method(s) that generate the random numbers
 * Experiment with different Random number generators -start with the random() method of the Math class but also 
 * explore Javas Random Class
 */


public class DiceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int random;
		char letter = 'y';		
		
		
			System.out.println("Welcome to the Grand Circus Casino!\n");
			System.out.println("How many sides should each die have?");
//The scanner here allows the user to select the dice, which will head down to the second method to generate
//random numbers from 1 to the amount the user selected. Ex: user inputs 10 it will generate random numbers 
//from 1-10.
			random = scan.nextInt();
// This while loop asks the user if he/she selects either y or Y to continue to another roll.		
		while ((letter == 'y') || (letter == 'Y')){
			System.out.println("Roll #1: ");
			System.out.println(rollingDice(random));
			System.out.println(rollingDice(random));	
			System.out.println("Roll Again? (Y/N)");
			letter = scan.next().charAt(0);
		}
		System.out.println("Goodbye");
			
		
		
	
	}
	
//method generates a random number from the scanner in the main method.
//The + 1 pushes the starting point from 0 to 1
//
	public static int rollingDice(int diceSides){
		int randomNum = (int)(Math.random()*diceSides) + 1;
	        return randomNum; 
		}
	
	
		
		
		
		

	}


