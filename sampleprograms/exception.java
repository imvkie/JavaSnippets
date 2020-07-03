package sample_programs;

class exception
{
public static void main(String args[])
{
int a=10, b=5, c=5, x;
try
{
x=a/(b-c);
System.out.println("result is "+x);
}
catch(ArithmeticException e)
{
System.out.println("Division result is zero");
}

}
}
