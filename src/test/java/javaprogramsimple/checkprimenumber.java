package javaprogramsimple;

public class checkprimenumber {

	public static void main(String[] args) {
		int[] num = {1, 2, 34, 43, 12, 8, 9, 90}; // Array of numbers

        System.out.println("Prime numbers in the array:");
        for (int number : num) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // Numbers <= 1 are not prime
        for (int i = 2; i <= n / 2; i++) { // Check divisors up to n/2
            if (n % i == 0) return false; // If divisible, it's not prime
        }
        return true; // If no divisors, it's prime
	}

}
