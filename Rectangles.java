class Shape {
    /**Shape can be rectangle or shape */
  int lenghth;
  int breadth;
    public void get()
  {
      breadth=30;
      lenghth=30;
  }
  public void print(){
      System.out.println("Length of shape is: "+breadth);
      System.out.println("Lenghth of shape is: "+lenghth);
  }
}
/**Rectangle shape specific class */
public class Rectangles extends shape
{
  int length=30,y=50;
    public void print()
    {
    System.out.println("Shape is rectangle specifically:-\n");
    System.out.println("Lenghth of Rectangle is:"+lenghth);
    System.out.println("Breadth of Rectangle Shape is:"+breadth);
    }
}
class Pro6
{  
          public static void main(String args[])
        {  
                    Shape s=new Shape();  
                    Rectangles r=new Rectangles();  
System.out.println("\nShape:-\n");               
     s.print();
System.out.println("\nRectangle:-\n");
                    r.print();
          }  
}  