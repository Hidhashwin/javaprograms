package javaprogramsimple;

public class evenoddfromarray {

	public void method1() {
		int a[] = { 1, 2, 3, 4, 5, 6 };

		System.out.println("Even numbers.......");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("odd numbers.......");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}
	public void method2() {
		int b[] = { 1,2,3,4,5,6 };
		
		System.out.println("EVEN NUMBERS.......");
		for(int value: b) {
			if (value % 2 == 0) {
				System.out.println(value);
			}
		}
		System.out.println("ODD NUMBERS.......");
		for(int value: b) {
			if (value % 2 != 0) {
				System.out.println(value);
			}
		}
	}

	public static void main(String[] args) {
		evenoddfromarray aa=new evenoddfromarray();
		aa.method1();
		aa.method2();
	}

}
