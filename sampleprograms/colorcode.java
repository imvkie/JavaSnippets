package sample_programs;
import java.util.*;
public class colorcode {

		private static Scanner sc;

		public static void main(String[] args) {

			String s = new String();
			String pattern = "^#(([A-Z0-9])(?=\\S+$).{3,})$";
			sc = new Scanner(System.in);
			System.out.println("Enter a color code");
			s = sc.next();
			if(s.length()==7)
			{
				if(s.matches(pattern))
					System.out.println("Valid color code");
				else System.out.println("Invalid color code");
			}
			else System.out.println("check for length");
		}
	}

