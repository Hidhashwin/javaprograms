package javaprogramsimple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class test {

	public static void main(String[] args) throws IOException {
		
		
		int n1=0,n2=1,sum=0;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<10;i++) {
			sum=n1+n2;
			System.out.print(" "+ sum);
			n1=n2;
			n2=sum;
		}
	}}
