package sample_programs;

import java.util.Scanner;

public class equalappend {
	private static Scanner sc;

	public static void main(String args[])
	{
		String s1,s2;
		int j=0;
		sc = new Scanner(System.in);
		s1=sc.next();
		s2=sc.next();
		if(s1.length()==s2.length())
		{
			System.out.println(s1+s2);
		}
		else 
		{
			char s[]=s2.toCharArray();
			char t[] =new char[s2.length()-1];

			for(int i=1;i<s2.length();i++)
			{
				 t[j++]=s[i];
			}
			System.out.print(s1);
			for(int i=0;i<s2.length()-1;i++)
			System.out.print(t[i]);
		}
	}

}
