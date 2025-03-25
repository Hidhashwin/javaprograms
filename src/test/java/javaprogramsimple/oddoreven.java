package javaprogramsimple;

public class oddoreven {

	public static void main(String[] args) {
		int num=12345;
		
		int evennum=0;
		int oddnum=0;
		
		while(num>0) {
			int digit = num % 10;
			if(num%2==0) {
				evennum++;
			}else {
				oddnum++;
			}
			num=num/10;
		}
		System.out.println("even numbers "+evennum);
		System.out.println("odd numbers "+oddnum);

	}

}
