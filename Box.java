//Add constructor to your box class
/*
class Box
{
float width; 
float height;
float depth;
Box()
{
width=10.23f;
height=20.56f;
depth=17.98f;
}
public void setWidth(float width)
{
this.width=width;
}
public float getWidth()
{
return width;
}
public void setHeight(float height)
{
this.height=height;
}
public float getHeight()
{
return height;
}
public void setDepth(float depth)
{
this.depth=depth;
}
public float getDepth()
{
return depth;
}
public static void main(String[] args)
{
Box object1=new Box();
System.out.println("Dimensions is "+object1.getWidth()+" X "+object1.getHeight()+" X "+object1.getDepth());
}
}
*/
//Show constructor overloading using Box class.
class Box
{
float width; 
float height;
float depth;
Box()
{
width=10.23f;
height=20.56f;
depth=17.98f;
}
Box(float width,float height,float depth)
{
this.width=width;
this.height=height;
this.depth=depth;
}
public void setWidth(float width)
{
this.width=width;
}
public float getWidth()
{
return width;
}
public void setHeight(float height)
{
this.height=height;
}
public float getHeight()
{
return height;
}
public void setDepth(float depth)
{
this.depth=depth;
}
public float getDepth()
{
return depth;
}
public static void main(String[] args)
{
Box object1=new Box();
System.out.println("Dimensions is "+object1.getWidth()+" X "+object1.getHeight()+" X "+object1.getDepth());
Box object2=new Box(23.5f,56.3f,71.4f);
System.out.println("Dimensions is "+object2.getWidth()+" X "+object2.getHeight()+" X "+object2.getDepth());
}
}