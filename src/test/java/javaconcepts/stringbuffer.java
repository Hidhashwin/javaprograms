package javaconcepts;

public class stringbuffer {
	
	public void buff() {
		StringBuffer buffer=new StringBuffer("Hello");
		
		System.out.println(buffer.replace(0, 1, "GA"));
		System.out.println(buffer.delete(0, 1));
		
		System.out.println(buffer.compareTo(buffer));
		System.out.println(buffer.isEmpty());
		
		buffer.reverse();
		System.out.println(buffer);
	}
	
	public void mutaleandimmutable() {
		System.out.println("String is MUTABLE");
		String name="GOPAL";
		System.out.println("Appending a name to original " + name.concat("KRISHNAN"));
		System.out.println("Original name "+ name);
		
		System.out.println("___________________________________");
		
		System.out.println("StringBuffer is IMMUTABLE");
		StringBuffer buffer=new StringBuffer("GOPAL");
		System.out.println("Appending a name to original " + buffer.append("KRISHNAN"));
		System.out.println("Original name "+ buffer);
	}

	public static void main(String[] args) {
		stringbuffer bn=new stringbuffer();
		bn.buff();
		bn.mutaleandimmutable();

	}

}
