package javaprogramsimple;

public class trycatchtest {

	public static void main(String[] args) {
		try {
            // Code that might throw an exception
            int number = 10;
            int result = number / 0; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace(); // Prints the stack trace to the console
        } finally {
            // Code that will always execute
            System.out.println("Execution of try-catch block is complete.");
        }
    }

	}


