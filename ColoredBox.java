class Box{
    int length=30,breadth=40;
    public void print()
    {
        System.out.println("Box class\n");
        System.out.println("Length of colored box is:"+length);
        System.out.println("Breadth of colored Box is:"+breadth);
    }
}
public class ColoredBox extends Box{
    String color="Red";
    public void print()
    {
        System.out.println("Colored Box class");
        System.out.println(color);
    }
    public static void main(String[] args) {
     ColoredBox c=new ColoredBox();
      c.print();        
    }
    
}
