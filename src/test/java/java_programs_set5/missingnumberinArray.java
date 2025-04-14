package java_programs_set5;

public class missingnumberinArray {

	public static void main(String[] args) {
		int num[]= {1,2,4,5};
		int sum1=0;
		
		for(int i=0;i<num.length;i++) {
			sum1=sum1+num[i];
		}
		
		System.out.println(sum1);
		
		int sum2=0;
		
		for(int i=1;i<=5;i++) {
			sum2=sum2+i;
		}
		System.out.println(sum2);
		int missingnum=0;
		
		missingnum=sum2-sum1;
		System.out.println(missingnum);
	

	}

}
