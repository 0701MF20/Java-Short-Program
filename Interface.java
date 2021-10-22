interface A
{
public void print1();
}
interface B
{
    public void print2();
}
interface C extends A,B
{
public void print3();
}
public class Interface implements C
{
public void print1()
{
    System.out.println("Interface a");
}
public void print2()
{
    System.out.println("Interface b");
}
public void print3() {
    System.out.println("Multiple Inheritance");
}
public static void main(String[] args) {
    Interface i=new Interface();
    i.print1();
    i.print2();
    i.print3();
}    

}
