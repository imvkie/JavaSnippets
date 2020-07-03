package sample_programs;

import java.util.Scanner;
class palindrome{  
 private static Scanner sc;

public static void main(String args[]){  
  int r,a,b=0;    
  int n;  
  System.out.println("Enter a number : ");  
  sc = new Scanner (System.in);
  n=sc.nextInt();
  a=n;    
  while(n>0){    
   r=n%10;  
   b=(b*10)+r;    
   n=n/10;    
  }    
  if(a==b)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  