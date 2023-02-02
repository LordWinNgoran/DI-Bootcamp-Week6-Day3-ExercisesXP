package atos;

/*
 *  Exercise 3 : Reversed Digits
 *  Write a program that prompts the user to input an integer and 
 *  then outputs the number with the digits reversed.
 *  
 *  For example, if the input is 12345, the output should be 54321.
 */
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer userInput;
		 int reverse = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print( "Please enter a integer : " );
		userInput = scanner.nextInt();
		while(userInput != 0)   
		{  
		int remainder = userInput % 10;  
		reverse = reverse * 10 + remainder;  
		userInput = userInput/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  

	}
}

