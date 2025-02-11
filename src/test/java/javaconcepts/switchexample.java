package javaconcepts;

public class switchexample {
	
	String superhero="ROCK";
	
	public void checking() {
		
		switch (superhero) {
		case "HHH":
			System.out.println("HHH is super hero");
			break;
		case "KANE":
			System.out.println("KANE is super hero");
			break;
		case "ROCK":
			System.out.println("ROCK is super hero");
			break;

		default:
			System.out.println("ROCK is hero");
			break;
		}
	}

	public static void main(String[] args) {
		switchexample examp=new switchexample();
		examp.checking();

	}

}
