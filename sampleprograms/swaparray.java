package sample_programs;

import java.util.Scanner;

public class swaparray {

	private static Scanner sc;

	public static void main(String[] args) {
		String s;
		sc = new Scanner (System.in);
		System.out.println("Enter a String :");
		s=sc.next();
		char a[] = s.toCharArray();
		if(s.length()%2==0)
		{
			for(int i=0;i<s.length()-1;i=i+2)
			{
				char temp;
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		else {
			for(int i=0;i<s.length()-2;i=i+2)
			{
				char temp;
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		for(int i=0;i<s.length();i++)
			System.out.print(a[i]);
	}

}
