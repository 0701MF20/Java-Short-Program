class BaseClass
{
    public void methodOne()
    {
System.out.println("Method One of Base Class");
    }
}
public class DynamicDispatch extends BaseClass {
    public void methodOne()
    {
        System.out.println("Method One of Dynamic Dispatch Class");
    }
public static void main(String[] args)
{
    BaseClass b=new BaseClass();
    b.methodOne();
    //Dynamic dispatch concept
    DynamicDispatch d=new DynamicDispatch();
    d.methodOne();
}
    
}
