package java_programs_set4;

public class touppercase_word {

	public static void main(String[] args) {

		String[] name = { "java", "python", "ruby" };

		// Convert each element to uppercase
		for (int i = 0; i < name.length; i++) {
			name[i] = name[i].toUpperCase();
		}

		// Print the updated array
		for (String n : name) {
			System.out.println(n);
		}

	}

}
