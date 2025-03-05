package javaconcepts;

public class conoverloading {
	String draw;

	conoverloading() {
		System.out.println("is created");
	}

	conoverloading(String todraw) {
		draw=todraw;
System.out.println("drawing " + todraw );
	}

	public static void main(String[] args) {
		conoverloading conoverloading=new conoverloading();
		conoverloading conoverloading1=new conoverloading("circle");
	}

}
