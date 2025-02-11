package javaconcepts;

public class polyoverriding extends parent {
	
	public void marriage() {
		System.out.println("my marriage my rules");
	}

	public static void main(String[] args) {
		
		parent p=new polyoverriding();
		p.property();
		p.marriage();
	}

}
