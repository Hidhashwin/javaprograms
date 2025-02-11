package javaprogramsimple;

public class swapnumbers {

	public void usingthirdvariable() {
		int mysalary=20;
		int superiorsalary=30;


		System.out.println("before swapping my salary: "+ mysalary+" superiorsalart: " + superiorsalary);

		int temp=mysalary;
		mysalary=superiorsalary;
		superiorsalary=temp;
		System.out.println("before swapping my salary: "+ mysalary+" superiorsalart: " + superiorsalary);
	}
	public void withoutusingthirdvariable() {
		int first=20;
		int second=50;
		System.out.println("before swapping first : "+ first+" second : " + second);

		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println("after swapping first : "+ first+" second : " + second);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapnumbers num=new swapnumbers();
		num.usingthirdvariable();
		num.withoutusingthirdvariable();

	}

}
