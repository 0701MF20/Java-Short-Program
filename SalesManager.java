 abstract class Employee {
 String name;
 double sal;
 double grosssal;
 Employee()
 {
     this.name="Employee";
     this.sal=50000.00;
 }
public void print()
 {
     System.out.println("Employee details are:-\n");
     System.out.println("Name : "+name);
     System.out.println("Basic Salary : "+sal);
 }
 public abstract double calculategrosssalary(double inc);
 public abstract double annualincrement();
}
class Manager extends Employee
{
    String hr;
    public double calculategrosssalary(double inc)
    {
        double grosssal=sal+inc;
        return grosssal;
    }
    public double annualincrement()
    {
        double inc=sal+(0.5*sal);
        return inc;
    }
   public Manager(String name,double sal) {
        this.name=name;
        this.sal=sal;
    }
}
public class SalesManager extends Manager
{
double commission;
public double calculategrosssalary(double inc)
{
    double grosssal=sal+inc+commission;
    return grosssal;
}
public SalesManager(String name,double sal,double commission)
{
    super(name, sal);
    this.commission=commission;
}
public static void main(String[] args)
{
    Manager emp1 = new Manager("Ross", 100000);
        SalesManager emp2 = new SalesManager("Alex", 50000, 25000);
        double gross = emp1.annualincrement();
        System.out.println("The Annual Income of Ross is " + emp1.calculategrosssalary(gross));
        double gross2 = emp2.annualincrement();
        System.out.println("The Annual Income of Alex is " + emp2.calculategrosssalary(gross2));
}
}
