package javaprogramsimple;

public class countcharacterocceurance {

	public static void main(String[] args) {
		String name="Hi Gopalakrishnan how are you?";
		int totallength=name.length();
		int totallengthafterrmovedA=name.replace("a", "").length();
		
		int countofa=totallength-totallengthafterrmovedA;
		
		System.out.println("number of occurance "+ countofa);

	}

}
