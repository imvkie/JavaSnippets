package sample_programs;

import java.util.Scanner;

public class evensquares {
	private static Scanner s;

	public static void main (String args[])
	{
		int a[] = new int[100];
		int n,sum=0;
		s = new Scanner (System.in);
		System.out.println("Enter the number of terms : ");
		n=s.nextInt();
		System.out.println("Enter the number : ");		
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		for(int i=0;i<n;i++)
		{
		if(a[i]%2==0)
		{
			while(a[i]>0)
				{
					sum=sum+(a[i]*a[i]);
					a[i]=a[i]/10;
				}
		}
		}
		System.out.println("The sum of square of even number is "+sum);
	}

}
