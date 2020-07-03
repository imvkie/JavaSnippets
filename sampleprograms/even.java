package sample_programs;

import java.util.Scanner;

public class even {
	private static Scanner sc;

	public static void main (String args[])
	{
		int j=0;
		sc = new Scanner (System.in);
		String s = sc.next();
		char a[] = s.toCharArray();
		char b[]=new char[(s.length()/2)];
		for(int i=1;i<s.length();i=i+2)
		{
			b[j++]=a[i];
		}
		System.out.println(b.length);
		if(b.length-1 <= 2)
			System.out.println(b[0]+" and "+b[1]+" are the characters");
		else		System.out.println(b[(b.length/2)-1]+" and "+b[(b.length/2)]+" are the middle characters");
	}

}
