package sample_programs;

import java.util.Scanner;

public class reversesort {

	private static Scanner sc;

	public static void main(String[] args) {

		int i,j=0;
		int a[]=new int[50];
		String s = new String();
		sc = new Scanner(System.in);
		System.out.println("Enter a String");
		s = sc.next();
		System.out.println("Enter a Char in that String");
		String t = sc.next();
		char s1[] = new char[100];
		char s2[] = new char[100];
		s1=s.toCharArray();
		
		for(i = 0;i<s1.length;i++)
		{
			int ascii = (int) s1[i];
			a[i]=ascii;
		}
		
	for(i=s1.length-1;i>=0;i--)
			s2[j++]=s1[i];
		for(i=0;i<s1.length;i++)
		{
			s1[i]= (char) a[i];
			System.out.print(s2[i]);
		}		
		System.out.println("");
		for(i=0;i<s2.length;i++)
		if(s2[i] == t.charAt(0))
			System.out.println(t+" is in the "+i+" place");
	}
}
