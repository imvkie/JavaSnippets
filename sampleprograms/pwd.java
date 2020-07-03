package sample_programs;

import java.util.Scanner;
public class pwd {

	private static Scanner sc;

	public static void main(String[] args) {

		String s = new String();
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$])(?=\\S+$).{6,20}";
		sc = new Scanner(System.in);
		System.out.println("Enter a password");
		s = sc.next();
		{
			if(s.matches(pattern))
				System.out.println("Valid password");
			else System.out.println("Invalid password");
		}
	}
}
