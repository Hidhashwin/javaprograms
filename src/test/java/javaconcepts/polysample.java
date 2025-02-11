package javaconcepts;

public class polysample {

	public int testpoly(int a, int b) {
		return a + b;
	}
	public int testpoly(int a, int b,int c) {
		return a+b+c;
	}

	public float testpoly(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		polysample poly=new polysample();
		System.out.println(poly.testpoly(5, 7));
		System.out.println(poly.testpoly(6, 7));
		System.out.println(poly.testpoly(2, 1, 1));
	}

}
