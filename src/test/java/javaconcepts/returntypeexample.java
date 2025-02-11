package javaconcepts;

public class returntypeexample {
	
	Integer collectedamount=1000;
	
	public Integer collectandgiveittome() {
		System.out.println("collected amount "+ collectedamount);
		return collectedamount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returntypeexample type= new returntypeexample();
		Integer amount=type.collectandgiveittome();
		
		System.out.println("got the amount "+ amount);
		
	}

}
