package atos;
/*
 *  Exercise 2 : Numbers Triangle
 *  Write a Java program that uses the loops to produce the following output:
 *  
 *   1
 *   22
 *   333
 *   4444
 *   55555
 *   666666
 *   7777777
 */
public class Exercise2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
        	if (i<=1) {
        		System.out.println(i);
			}else {
				String value = String.valueOf(i);
				 System.out.println(i+""+value.repeat(i-1));
			}
        	 
        }

	}

}
