package sample_programs;

import java.util.Scanner;

public class oddout {

	private static Scanner sc;

	public static void main(String[] args) {

		String s = new String();
		sc = new Scanner(System.in);
		System.out.println("Enter a String");
		s = sc.next();
		char[] s1 = new char[100];
		s1=s.toCharArray();
		
		for(int i =1;i<s1.length;i=i+2)
		{
			System.out.print(s1[i]);
		}
		
	}

}
