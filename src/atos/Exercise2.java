
// Exercise 2 : Numbers Triangle
/*
 * @author: N'goran Kouadio Jean Cyrille
 * @description:  Write a Java program that uses the loops to produce the following output:
 * Date : 02/02/2023
 *
 *   1
 *   22
 *   333
 *   4444
 *   55555
 *   666666
 *   7777777
 */
package atos;

public class Exercise2 {
	public static void main(String[] args) {
		// We use a for loop to navigate
		for (int i = 1; i <= 7; i++) {
			// If is 1 we print 1 only
			if (i <= 1) {
				System.out.println(i);
			} else {
				// else we print the number iterate by i
				String value = String.valueOf(i);
				System.out.println(i + "" + value.repeat(i - 1));
			}

		}

	}

}
