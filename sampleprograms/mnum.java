package sample_programs;
import java.util.*;
public class mnum {

	private static Scanner sc;

	public static void main(String[] args) {

		String s = new String();
		String pattern = "\\d{3}-\\d{3}-\\d{4}";
		sc = new Scanner(System.in);
		System.out.println("Enter your mobile number as xxx-yyy-zzzz");
		s = sc.next();		
			if(s.matches(pattern))
				{
				System.out.println("Valid number");
				}
			else System.out.println("Invalid type");
		}
	}
