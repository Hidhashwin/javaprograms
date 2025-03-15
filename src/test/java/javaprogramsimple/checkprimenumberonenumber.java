package javaprogramsimple;

import java.util.Scanner;

public class checkprimenumberonenumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER NUMBER: ");
		int number = scanner.nextInt();

		boolean isprime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isprime = false;
				break;
			}

		}
		if (isprime && number > 0) {
			System.out.println(number + " is prime");
		} else {
			System.out.println(number + " is not prime");
		}

	}

}
