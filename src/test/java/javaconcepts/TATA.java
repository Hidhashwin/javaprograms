package javaconcepts;

public class TATA extends car {
	public void engine() {
		System.out.println("this is TATA engne");
	}
	public void companyvault() {
		System.out.println("this is TATA companyvault");
	}

	public static void main(String[] args) {

		car ca = new TATA();
		ca.companyvault();
		ca.engine();
	}

}
