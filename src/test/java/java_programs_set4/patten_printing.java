package java_programs_set4;

import java.util.Scanner;

public class patten_printing {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        // Get the number of rows for the pattern
		        System.out.print("Enter the number of rows: ");
		        int rows = scanner.nextInt();

		        // Print the pattern
		        for (int i = 1; i <= rows; i++) { // Loop for rows
		            for (int j = 1; j <= i; j++) { // Loop for columns in each row
		                System.out.print("*"); // Print a star
		            }
		            System.out.println(); // Move to the next line after each row
		        }

		        scanner.close(); // Close the Scanner
		    }
		

	}


