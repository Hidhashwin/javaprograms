package javaprogramsimple;

import java.util.HashSet;
import java.util.Random;

public class test {

    public static void main(String[] args) {
    	String name = "hi ram how are you";
        String[] words = name.split(" ");
        
        for (String word : words) {
            System.out.println(word);
        }
    }
    
    
}
