package javaprogramsimple;

public class oddorevennumber {

	public static void main(String[] args) {
		int number = 123456;
        int oddnum = 0;
        int evennum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evennum++;
            } else {
                oddnum++;
            }
            number = number / 10;
        }
        System.out.println("Number of even digits: " + evennum);
        System.out.println("Number of odd digits: " + oddnum);
    }
}