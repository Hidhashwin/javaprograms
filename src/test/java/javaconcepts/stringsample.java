package javaconcepts;

public class stringsample {
	
	public void st() {
	
	String name="Arun";
	name="riya";
	
	System.out.println(name.charAt(0));
	System.out.println(name.contains("me"));
	System.out.println(name.length());
	System.out.println(name.toCharArray());
	System.out.println(name.equals("Arul"));
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	System.out.println(name.isEmpty());
	System.out.println(name.substring(1,2));
	System.out.println(name.concat("Arulprasanth"));
	System.out.println(name);
	}
	public static void main(String[] args) {
		stringsample sample=new stringsample();
		sample.st();

	}

}
