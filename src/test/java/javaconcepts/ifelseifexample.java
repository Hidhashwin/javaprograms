package javaconcepts;

public class ifelseifexample {
	
	String hero="superman";
	
	public void deducter() {
		if (hero.equalsIgnoreCase("batman")) {
			System.out.println("batman");
		}else if (hero.equalsIgnoreCase("spiderman")) {
			System.out.println("spiderman");
		}else if (hero.equalsIgnoreCase("superman")) {
			System.out.println("superman");
		}else {
			System.out.println("no one");
		}
	}

	public static void main(String[] args) {
		
		ifelseifexample sam=new ifelseifexample();
		sam.deducter();
	}

}
