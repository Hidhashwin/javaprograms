package javaconcepts;

public class BMW extends car {
	
	public void engine() {
		System.out.println("this is BMW engne");
	}
	public void companyvault() {
		System.out.println("this is BMW companyvault");
	}

	public static void main(String[] args) {
		
      car ca=new BMW();
      ca.companyvault();
      ca.engine();
	}

}
