package java_programs_set1;

public class countcharacterocceurance {

	public void using_replaceinbuild() {

		String name = "Hi Gopalakrishnan how are you?";
		int totallength = name.length();
		int totallengthafterrmovedA = name.replace("a", "").length();

		int countofa = totallength - totallengthafterrmovedA;

		System.out.println("number of occurance using inbuildmethod " + countofa);
	}

	public void using_forloop() {
		String name = "aa IUJhn 123 &^& aa A";
		char targetChar = 'a'; // Character to count
		int occurrence = 0;

		for (int i = 0; i < name.length(); i++) { // Loop through the string
			if (name.charAt(i) == targetChar) { // Compare each character
				occurrence++; // Increment count if character matches
			}
		}
		System.out.println("using for loop");
		System.out.println("Occurrences of '" + targetChar + "': " + occurrence);
	}

	public static void main(String[] args) {

		countcharacterocceurance car = new countcharacterocceurance();
		car.using_replaceinbuild();
		car.using_forloop();

	}

}
