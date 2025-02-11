package javaprogramsimple;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		int num=1234;
		int even_num=0;
		int odd_num=0;
		
		while(num>0) {
			int reminder=num%10;
			if(reminder%2==0) {
				even_num++;
				
			}else {
				odd_num++;
				
			}
			num=num/10;
			
		}
		System.out.println(even_num);
		System.out.println(odd_num);
	}
	
	

}
