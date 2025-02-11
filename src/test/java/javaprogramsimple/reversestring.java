package javaprogramsimple;

import java.util.Iterator;

public class reversestring {
	
	public void method1(){ //using string concatenation
		String name="GOPAL";
		String rev="";
		
		int length=name.length();//5
		
		for(int i=length-1;i>=0;i--) //4 3 2 1 0 -1
		{
			rev=rev+name.charAt(i); //LAPOG
		}
		System.out.println("reverse number is " + rev);
			
		}
	public void method2() {//using stingbuffer
		
		StringBuffer buffer=new StringBuffer("JADDQ");
		buffer.reverse();
		
		System.out.println("Using stringbufferclass " +buffer);
		
		
	}

	public static void main(String[] args) {
		reversestring st=new reversestring();
		st.method1();
		st.method2();

	}

}
