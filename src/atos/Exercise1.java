// Exercise 1 : Print Stars
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description: Write a program in Java to print the following pattern.
 *   *
 *	 *
 * 	 * *
 * 	 * * *
 * Date : 02/02/2023
 */
package atos;

public class Exercise1 {

	public static void main(String[] args) {
		/* We use a for loop to navigate and output the * like is
		 * String we can use repeat
		*/
		for (int i = 0; i <=4; i++) {
			System.out.println("*".repeat(i));
	    	 
	    }
	}
	
}
