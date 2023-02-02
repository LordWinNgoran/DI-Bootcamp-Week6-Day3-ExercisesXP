package atos;

/*
 * Exercise 4 : Armstrong Numbers
 *  Write a program to print out all Armstrong numbers between 1 and 500. 
 *  If sum of cubes of each digit of the number is equal to the number itself, 
 *  then the number is called an Armstrong number.
 *  
 *  For example, 153 = ( 1 _ 1 _ 1 ) + ( 5 _ 5 _ 5 ) + ( 3 _ 3 _ 3 )
 */

import java.lang.Math;
public class Exercise4 {

	public static void main(String[] args) {
		int x, y, z; // x y z =x³+y³+z³
		int amstrong;
		int somcube;
		// xyz =x^3+y^3+z^3 xyz=x*100+y*10+z

		for (x = 1; x < 5; x++)// x=[100-499]
		{
			for (y = 0; y < 9; y++) {
				for (z = 0; z < 9; z++) {
					somcube = (int) (Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3));
					amstrong = (100 * x) + (y * 10) + z;
					if (somcube == amstrong) {
						System.out.println(amstrong+" = ( "+x+"_"+x+"_"+x+" ) + ( "+y+"_"+y+"_"+y+" ) + ( "+z+"_"+z+"_"+z+")");
						System.out.println("La somme de leur cube est bien egal a: "+somcube);
					}
				}
			}
		}

	}

}
