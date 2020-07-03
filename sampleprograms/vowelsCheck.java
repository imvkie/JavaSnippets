package sample_programs;

import java.util.Scanner;
public class vowelsCheck
{
	private static Scanner s;

	public static void main(String[] args) 
	{
		String a;
		System.out.print("Enter a String : ");
		s = new Scanner(System.in);
		a = s.next();		
		String a1 = "aeiou";
		char b[] = a1.toCharArray();
		char b1[] = a.toCharArray();
                System.out.println("Vowels in " + a + " are : ");
		for(int i=0;i<a.length();i++)
			{
				for(int j=0;j<a1.length();j++)
			{
					if (b1[i]==b[j])
						System.out.println(b1[i]);
			}
		
			}
	}

}
