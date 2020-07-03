package sample_programs;

import java.util.Scanner;
class grade
{
private static Scanner sc;

public static void main(String args[])
{
sc = new Scanner(System.in);
int m1,m2,m3,m4,m5,m6,total,avg;
System.out.println("Enter the marks of six subjects");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
m5=sc.nextInt();
m6=sc.nextInt();
total=m1+m2+m3+m4+m5+m6;
avg=total/6;
if(avg>90)
System.out.println("S grade");
else if(avg>80 && avg<=90)
System.out.println("A grade");
else if(avg>70 && avg<=80)
System.out.println("B grade");
else if(avg>60 && avg<=70)
System.out.println("C grade");
else if(avg>55 && avg<=60)
System.out.println("D grade");
else if(avg>49 && avg<=55)
System.out.println("E grade");
else
System.out.println("U grade");
}
}