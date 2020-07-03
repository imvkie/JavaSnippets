package sample_programs;

import java.util.Scanner;
class a
{
void base(int a,int b)
{
int c=a+b;
System.out.println("base class addition : "+c);
}
}
class b extends a
{
void derived(int a,int b)
{
int d=a-b;
System.out.println("derived class subtraction : "+d);
}
}
public class inheritance
{
private static Scanner sc;

public static void main (String args[])
{
int a,b;
System.out.println("Enter two numbers : ");
sc = new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
b b1 = new b();
b1.base(a,b);
b1.derived(a,b);
}
}