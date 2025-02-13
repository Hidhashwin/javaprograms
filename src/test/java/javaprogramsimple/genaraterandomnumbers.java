package javaprogramsimple;

import java.util.Random;

public class genaraterandomnumbers {

	public static void main(String[] args) {
		Random random=new Random();
		int number=random.nextInt(99);
		
		double dcnumber= random.nextDouble(1);
		
		System.out.println("Random number is "+ number);
		System.out.println("Random number is "+ dcnumber);
		
		//we can use apache api external jar as well to generate ramdom numbers and string

	}

}
