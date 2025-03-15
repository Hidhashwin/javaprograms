package javaprogramsimple;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		 int num = 23; // The number to be checked
	        boolean isPrime = true;

	        if (num <= 1) {
	            isPrime = false; // Numbers less than or equal to 1 are not prime
	        } else {
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break; // Exit the loop if a divisor is found
	                }
	            }
	        }

	        if (isPrime) {
	            System.out.println(num + " is a prime number.");
	        } else {
	            System.out.println(num + " is not a prime number.");
	        }
	}
}
