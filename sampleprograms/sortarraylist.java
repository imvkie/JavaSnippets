package sample_programs;

import java.util.*;

public class sortarraylist {

	private static Scanner sc;

	public static void main(String[] args) {
			ArrayList<Integer> a = new ArrayList<Integer>();
			ArrayList<Integer> b = new ArrayList<Integer>();
	        sc = new Scanner(System.in);
	        System.out.println("Enter 5 integers");
	        a.add(sc.nextInt());
	        a.add(sc.nextInt());
	        a.add(sc.nextInt());
	        a.add(sc.nextInt());
	        a.add(sc.nextInt());
	        System.out.println("Enter another 5 integers");
	        b.add(sc.nextInt());
	        b.add(sc.nextInt());
	        b.add(sc.nextInt());
	        b.add(sc.nextInt());
	        b.add(sc.nextInt());
	        a.addAll(b);
	        System.out.println("After adding all the elements");
	        System.out.println(a);
	        Collections.sort(a);
	        System.out.println("After sorting all the elements");
	        System.out.println(a);

	}

}
