package javaprogramsimple;

public class Replacecowelwith_Specialchar {
	public static String name = "Arunprasath";
	String newname = name.toLowerCase();
	
	public void using_Regularexpression() {
	
		newname = name.toLowerCase();
		
		String t=newname.replace("a", "*");
		System.out.println(t);
		
	}
	
	public void using_forloop() {
		char[] chararray=name.toCharArray();
		
		for(int i=0;i<name.length();i++) {
			if (newname.charAt(i) == 'a' || newname.charAt(i) == 'e' || newname.charAt(i) == 'i'
					|| newname.charAt(i) == 'o' || newname.charAt(i) == 'u') {
			chararray[i]='@';
		}
		}
		for(int i=0;i<name.length();i++) {
			System.out.print(chararray[i]);
		}
		
	}

	public static void main(String[] args) {
		Replacecowelwith_Specialchar test=new Replacecowelwith_Specialchar();
		test.using_forloop();
		test.using_Regularexpression();

	}

}
