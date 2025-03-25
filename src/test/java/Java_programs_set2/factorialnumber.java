package Java_programs_set2;

public class factorialnumber {

	

	public void ascending() {
		
		int num = 5;
		long factorial = 1;

		// 5!= 1*2*3*4*5=120 ascending order
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of the num is: " + factorial);

	}

	public void decending() {
		
		int num = 5;
		long factorial = 1;
		// 5!=5*4*3*2*1=120 descending order
		for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of the num is: " + factorial);
	}

	public static void main(String[] args) {
		factorialnumber factorial = new factorialnumber();
		factorial.ascending();
		factorial.decending();

	}

}
