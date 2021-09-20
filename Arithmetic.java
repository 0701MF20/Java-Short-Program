class Arithmetic
{
public void addition(int a,int b)
{
int sum=a+b;
System.out.println("Addition :"+sum);
}
public void subtraction(int a,int b)
{
int minus=b-a;
System.out.println("Addition :"+minus);
}
public void multiplication(int a,int b)
{
int multiply=a*b;
System.out.println("Multiplication :"+multiply);
}
public void division(int a,int b)
{
float divide=(float)b/a;
System.out.println("Division :"+divide);
}
public static void main(String[] args)
{
Arithmetic object1=new Arithmetic();
object1.addition(6,9);
object1.subtraction(8,9);
object1.multiplication(7,10);
object1.division(5,18);
}
}