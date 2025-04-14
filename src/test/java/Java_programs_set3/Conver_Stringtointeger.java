package Java_programs_set3;

public class Conver_Stringtointeger {

	public static void main(String[] args) {
		
		        String numberString = "12345";

		        // Converting the string to an integer
		        try {
		            int number = Integer.parseInt(numberString);
		            System.out.println("The integer value is: " + number);
		        } catch (NumberFormatException e) {
		            System.out.println("Invalid string format for conversion to an integer.");
		        }
		    }
		}


