import java.util.EmptyStackException;
class Stack
{
    public int arr[];
    public int size;
    public int index=0;   
    public Stack(int size) {
        this.size = size;
        arr=new int[size];
    }
public void push(int element)
{
    if(isFull())
    {
      throw new StackOverflowError("Stack overflow");
    }
    arr[index++]=element;
}
public int pop()
{
if(isEmpty())
{
    throw new EmptyStackException();
}
return arr[--index];
}
public boolean isFull()
{
    if(index==size)
    {
        return true;    
    }
    return false;
}
public boolean isEmpty()
{
    if(index==0)
    {
    return true;
    }
    return false;
}
public int size()
{
return index;
}
}
public class StackOperation {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException
    {
       	Stack s1=new Stack(5);        
        s1.push(5);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        int items;
        System.out.println("Items are:-\n");
        while(!s1.isEmpty())
        {
         items=s1.pop();
         System.out.println(items);
         }  
System.out.println("\nSize of stack after pop operations : " + s1.size()); 
    }
    
}

