package javaconcepts;

public class Test {
	String draw;

	public  int Testing(int a,int b) {
		return a+b;
	}

	public int Testing(int a,int b,int c) {
		return a+b+c;
	}
	
	public float Testing(float a,float b) {
		return a+b;
	}

	public static void main(String[] args) {
		Test te=new Test();
		System.out.println(te.Testing(2, 6));
		System.out.println(te.Testing(6, 10));
		System.out.println(te.Testing(6, 10,20));
	}

}
