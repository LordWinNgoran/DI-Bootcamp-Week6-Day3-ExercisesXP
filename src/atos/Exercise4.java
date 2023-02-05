
//Exercise 4 : Armstrong Numbers
/*
*  	@author: N'goran Kouadio Jean Cyrille
* 	@description: Write a program to print out all Armstrong numbers between 1 and 500. 
*  	If sum of cubes of each digit of the number is equal to the number itself, 
*  	then the number is called an Armstrong number.
* 	Date : 02/02/2023
* 	For example, 153 = ( 1 _ 1 _ 1 ) + ( 5 _ 5 _ 5 ) + ( 3 _ 3 _ 3 )
*/

package atos;

import java.lang.Math;

public class Exercise4 {

	public static void main(String[] args) {
		// Declaration part
		int x, y, z; // x y z =x³+y³+z³
		int amstrong;
		int somcube;
		// xyz =x^3+y^3+z^3 xyz=x*100+y*10+z

		// all armstrong number 100-500
		// We use 3 for loop to go to 500
		// the first go to 5
		for (x = 1; x < 5; x++) {
			// the second go to 10
			for (y = 0; y < 9; y++) {
				// the third go to 10
				for (z = 0; z < 9; z++) {
					// A armstrong number each number pow 3 in addition give the same number
					somcube = (int) (Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3));
					amstrong = (100 * x) + (y * 10) + z;
					if (somcube == amstrong) {
						System.out.println(amstrong + " = ( " + x + "_" + x + "_" + x + " ) + ( " + y + "_" + y + "_"
								+ y + " ) + ( " + z + "_" + z + "_" + z + ")");
						System.out.println("The sum of all number pow is :  " + somcube);
					}
				}
			}
		}

	}

}
