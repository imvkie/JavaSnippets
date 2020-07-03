package sample_programs;

import java.util.Scanner;

public class ignore {

	private static Scanner s;

	public static void main(String[] args) {
		int x,y,z,a;
		System.out.println("Enter three numbers : ");
		s = new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		if(x==10)
		{
			x=0;
			a=y+z;
		}
		else	if(y==10)
		{
			y=0;
			a=x+z;
		}
		else	if(z==10)
		{
			z=0;
			a=y+x;
		}
		else if(x==10 && y==10)
		{
			x=0;
			y=0;
			a=z;
		}
		else if(y==10 && z==10)
		{
			y=0;
			z=0;
			a=x;
		}
		else if(z==10 && x==10)
		{
			z=0;
			x=0;
			a=y;
		}
		else
		{
			a=x+y+z;
		}
		
		System.out.println(a);
	}

}
