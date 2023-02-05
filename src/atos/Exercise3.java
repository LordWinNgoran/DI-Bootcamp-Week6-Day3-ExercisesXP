// Exercise 3 : Reversed Digits
/*
 *  @author: N'goran Kouadio Jean Cyrille
 * 	@description: Write a program that prompts the user to input an integer and 
 *  then outputs the number with the digits reversed.
 * 	Date : 02/02/2023
 *  For example, if the input is 12345, the output should be 54321.
 */
package atos;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// declaration part
		Integer userInput;
		int reverse = 0;
		// We use the scanner to store the user input in var
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter a integer : ");
			// We take the user input
			userInput = scanner.nextInt();
		}
		// White the user input is different of 0
		while (userInput != 0) {
			// var to calulate the modulo of user input by 10
			int remainder = userInput % 10;
			//to reverse we calculate the reverse = 0 init 
			reverse = reverse * 10 + remainder;
			userInput = userInput / 10;
		}
		//We output the reverse
		System.out.println("The reverse of the given number is: " + reverse);

	}
}
