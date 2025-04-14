package Java_programs_set3;

import java.util.Scanner;

public class check_Leapyear {

	public static void main(String[] args) {
		
		       Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a year: ");
		        int year = scanner.nextInt();

		        // Check for leap year
		        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		            System.out.println(year + " is a leap year.");
		        } else {
		            System.out.println(year + " is not a leap year.");
		        }

		        scanner.close();
		    }
		}

	
