package sample_programs;

import java.util.Scanner;
class fibonacci{  
private static Scanner sc;

public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,count;
 sc = new Scanner (System.in);
 System.out.println("Enter a number : ");
 count = sc.nextInt();    
 System.out.print(n1+" "+n2);    
    
 for(i=2;i<count;++i) 
 {    
  n3=n1+n2;       
  n1=n2;    
  n2=n3; 
  System.out.print(" "+n3);   
 }    
  
}}  