package sample_programs;

import java.util.Scanner;

public class NumToDigit 
{

	private static Scanner s;

	public static void main(String[] args) 
	{
			int x,z,count=0,i=0;	
			System.out.println("Enter the number : ");
			s = new Scanner (System.in);
			x=s.nextInt();
			z=x; 
	while (z > 0) 
		{
			count += 1;
			z = (z / 10);
		}
    int y[] = new int[count];
    while(x>0)		
     	{	
			y[i]=x%10;
			i++;
			x=x/10;
		}
			for(int j=count-1;j>=0;j--)
				System.out.println(y[j]);
			
		
	}
}
