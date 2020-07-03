package sample_programs;


import java.util.Scanner;

public class sizeofarray {

	private static Scanner sc;
	public static void main(String[] args) {
		final int size = 50;
		String s;
		char a[]= new char[size];
		sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		s=sc.nextLine();
		System.out.println(s);
		a=s.toCharArray();
		int len=a.length;
		if(len > 0)
		{
			System.out.println("size of the array is "+(size-len));
		}
		else System.out.println("size of the array is "+size);
	}

}
