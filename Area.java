class Area
{
public int area(int s)
{
return s*s;
}
public float area(float height,float breadth)
{
return (height*breadth)/2;
}
public int area(int l,int b)
{
return l*b;
}
public static void main(String[] args)
{
Area square=new Area();
int area_square=square.area(5);
System.out.println("Area of square :"+area_square);
Area triangle=new Area();
float area_triangle=triangle.area(5.5f,8.9f);
System.out.println("Area of triangle :"+area_triangle);
Area rectangle=new Area();
int area_rectangle=square.area(9,11);
System.out.println("Area of rectangle :"+area_rectangle);
}
}