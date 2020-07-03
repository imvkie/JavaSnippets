package sample_programs;

import java.util.Scanner;
class greatest
{
private static Scanner sc;

public static void main(String args[])
{
sc = new Scanner(System.in);
int a,b;
System.out.println("Enter two values");
a=sc.nextInt();
b=sc.nextInt();
if(a>b)
System.out.println(a+" is greater");
else
System.out.println(b+" is greater");
}
}