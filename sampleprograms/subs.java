package sample_programs;

import java.util.*;
public class subs {

    private static Scanner sc;

	public static void main(String[] args) {
        String a,b;
        char a1[]=new char[100000];
        char b1[] = new char[100000];
        int len=0;
        sc = new Scanner (System.in);
        a=sc.next();
        b=sc.next();
        a1=a.toCharArray();
        b1=b.toCharArray();
                for(int i=0;i<a.length();i++)
        for(int j=0;j<a.length();j++)
        if(a1[i]==b1[j])
        {
            System.out.print(a1[i]);
            len++;
        }
        System.out.print(" ");
        System.out.print(len);
    }
}