package javaprogramsimple;

public class oddorevennumber {

	public static void main(String[] args) {
		int num=123456;
		int odd_num=0;
		int even_num=0;
		
		while(num>0) {
			int reminder=num%10;
			if(reminder%2==0) {
				even_num++;
			}else {
				odd_num++;
			}
			num=num/10;
		}
		System.out.println("total even numbers "+ even_num);
		System.out.println("total odd numbers "+ odd_num);
	}

}
