package sample_programs;

import java.util.Scanner;

public class same {

	private static Scanner sc;

	public static void main(String[] args) {
		String s;
		sc = new Scanner(System.in);
		s=sc.next();
		char a[]=s.toCharArray();
		if(a[0]==a[s.length()-1])
		{
			System.out.println("Equal first and last chars");
		}
		else System.out.println("not equal chars");
	}

}
