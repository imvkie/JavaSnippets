package sample_programs;
import java.util.Scanner;
public class vowelsOddOut
{

	private static Scanner s;

	public static void main(String[] args) 
	{
		String a = new String();
		System.out.println("Enter a String : ");
		s = new Scanner(System.in);
		a = s.next();		
		String a1 = "aeiou";
		char b[] = a1.toCharArray();
		char b1[] = a.toCharArray();
		for(int i=0;i<a.length();i++)
			{
				for(int j=0;j<a1.length();j++)
			{
					if (b1[i]==b[j])
						for(int i1=i;i1<a.length();i1=i1+2)
							b1[i1]='$';
			}
		
			}
		for(int i=0;i<a.length();i++)
			if(b1[i] != '$')
		System.out.print(b1[i]);
                System.out.println(" are not vowels");
	}

}
