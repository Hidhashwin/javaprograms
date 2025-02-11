package javaconcepts;

public class Parameterisedconstructor {
	
	String animal_name;
	String animal_type;
	
	Parameterisedconstructor(String name, String type){
		 animal_name=name;
		 animal_type=type;
	}
	
	public void sayablotanimal() {
		System.out.println("animal name is "+ animal_name + " animal type is " + animal_type); 
	}

	public static void main(String[] args) {
		Parameterisedconstructor bb1= new Parameterisedconstructor("cock", "alleat");
		bb1.sayablotanimal();
		Parameterisedconstructor bb2= new Parameterisedconstructor("dove", "alleat");
		bb2.sayablotanimal();

	}

}
