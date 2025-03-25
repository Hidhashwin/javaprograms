package Java_programs_set2;

public class sumofarray {

	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 8, 9 }; // n-1=4
		int sum = 0;

		for (int i=0;i<=a.length-1;i++) {

			sum = sum + a[i];

		}
		
		//advanced forloop
		//for(int q: a){
		//sum=sum+q;
	//}
		System.out.println("sum of array element " +sum);
	}

}
