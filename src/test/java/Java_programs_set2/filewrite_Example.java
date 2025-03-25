package Java_programs_set2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class filewrite_Example {

	public static void main(String[] args) {
		
		try {
		
		FileWriter writer=new FileWriter("src\\test\\java\\Java_programs_set2\\text2.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(writer);
		bufferedWriter.write("I am writing");
		bufferedWriter.newLine();
		bufferedWriter.write("I am writing2");
		
		bufferedWriter.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
