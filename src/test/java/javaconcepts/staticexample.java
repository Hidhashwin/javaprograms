package javaconcepts;

public class staticexample {

	public static String name = "arun";

	static {
		System.out.println("static blockone");
	}
	static {
		System.out.println("two");
	}
	public static void testing() {
		System.out.println("method one");
	}

	public static void main(String[] args) {
		staticexample ob = new staticexample();
		System.out.println(ob.name);
		ob.testing();

	}

}
