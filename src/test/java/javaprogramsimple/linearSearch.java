package javaprogramsimple;

public class linearSearch {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };

		int search_num = 60;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (search_num == a[i]) {
				System.out.println("element found at " + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("element not found");
		}

	}
}