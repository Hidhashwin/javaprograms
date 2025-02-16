package javaprogramsimple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readdatafromtextfile {

	public static void main(String[] args) throws IOException {
		
		FileReader reader=new FileReader("src\\test\\java\\javaprogramsimple\\text.txt");
		BufferedReader br=new BufferedReader(reader);
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}

}
