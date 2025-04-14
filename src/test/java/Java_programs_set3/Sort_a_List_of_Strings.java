package Java_programs_set3;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_a_List_of_Strings {

	public static void main(String[] args) {
		
		        // Create a list of strings
		        ArrayList<String> stringList = new ArrayList<>();
		        stringList.add("Apple");
		        stringList.add("Mango");
		        stringList.add("Banana");
		        stringList.add("Cherry");
		        stringList.add("Pineapple");

		        // Sort the list using Collections.sort()
		        Collections.sort(stringList);

		        // Print the sorted list
		        System.out.println("Sorted List of Strings:");
		        for (String str : stringList) {
		            System.out.println(str);
		        }
		    }
		}

	


