package sample_programs;

import java.util.Scanner;
class factorial		
{
private static Scanner sc;

public static void main(String args[])
{
sc = new Scanner(System.in);
int i,f=1,num;
System.out.println("Enter a value");
num = sc.nextInt();
for(i=1;i<=num;i++)
    f=f*i;
System.out.println("factorial of " + num + " is " +f);
}
}