package javaprogramsimple;

public class reversesentense {

	public static void main(String[] args) {
		String str = "Welcome to java";
		String[] word = str.split("");
		String revsentense = "";

		for (int i=word.length-1;i>=0;i--) {
			StringBuilder builder = new StringBuilder(word[i]);
			builder.reverse();

			revsentense = revsentense + builder.toString() + "";
		}
		System.out.println(revsentense);
	}

}
