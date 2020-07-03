package sample_programs;

import java.util.Scanner;

public class sort 
{

	private static Scanner sc;

	public static void main(String[] args) 
	{
		int n,i,j;
		int a[] = new int[50];
		sc = new Scanner (System.in);
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[i]<a[j])
					{
						int temp;
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
			}
		}
		for(i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
		System.out.println("\nThe maximum number is "+a[n-1] );
		System.out.println("The minimum number is "+a[0]);
		int c = a[n-1]-a[0];
		System.out.println("Difference between maximum and minumum is "+c);
	}

}
