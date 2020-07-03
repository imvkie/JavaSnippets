package sample_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Stringmove {

	private static Scanner sc;

	public static void main(String[] args) {
		String s = new String();
		char a[] = new char[50];
		char b[] = new char[50];
		char c[] = new char[50];
		int len,i;
		System.out.println("Enter a String : ");
		sc = new Scanner(System.in);
		s=sc.next();
		a=s.toCharArray();
		len=s.length();
		c=s.toCharArray();
	do
	{	b[0]=a[0];
		for(i=0;i<len-1;i++)
		a[i]=a[i+1];
		a[len-1]=b[0];
		for(i=0;i<len;i++)
		System.out.print(a[i]);
		System.out.println();
	}while (!Arrays.equals(a, c));
}
}