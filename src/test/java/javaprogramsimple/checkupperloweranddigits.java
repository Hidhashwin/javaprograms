package javaprogramsimple;

public class checkupperloweranddigits {
	
	public static void gettext(String getname) {
		
		int uppercase=0;
		int lowercase=0;
		int numbers=0;
		int others=0;
		
		int length=getname.length();
		
		for(int i=0;i<length;i++) {
			char cr=getname.charAt(i);
			if(Character.isUpperCase(cr)) {
				uppercase++;
			}
			else if(Character.isLowerCase(cr)) {
				lowercase++;
			}
			else if(Character.isDigit(cr)) {
				numbers++;
			}else {
				others++;
			}
			
		}
		
		System.out.println("Total uppercases "+ uppercase);
		System.out.println("Total lowercases "+ lowercase);
		System.out.println("Total numbers "+ numbers);
		System.out.println("Total others "+ others);
	}

	public static void main(String[] args) {
		gettext("Gopalakr123&^* ishnan");
		}
	}


