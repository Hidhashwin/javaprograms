package javaprogramsimple;

public class findvowels {

	public static void main(String[] args) {
		String name = "Arunprasath";
		name = name.toLowerCase();

		int vowelcount = 0;

		int length = name.length();
		for (int i = 0; i < length; i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				vowelcount++;
			}
		}
		System.out.println("vowel count is " + vowelcount);
	}

}
