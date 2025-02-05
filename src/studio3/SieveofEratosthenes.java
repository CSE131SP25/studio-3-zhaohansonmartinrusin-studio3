package studio3;

import java.util.Scanner;

public class SieveofEratosthenes {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers would you like to filter?");
		int n = in.nextInt();

		int[] array = new int[n]; 

		for( int i = 0; i < n; i++) {

			array[i] = i + 1;
			System.out.println(array[i]);
		}

		for( int j = 2; j < n; j++) {

			for( int k = 4; k < n; k++) { 

				if( array[k] % j == 0) {
					array[k] = 0;

				}
			}
		}
		
		for (int g : array) {
			if (g > 0) {
				System.out.println(g);
				
			}
		}
	}}
