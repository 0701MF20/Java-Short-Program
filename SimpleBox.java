class SimpleBox
{
float width; 
float height;
float depth;
void volume(float wid,float high,float deep)
{
float vol;
width=wid;
height=high;
depth=deep;
vol=width*height*depth;
System.out.println("Volume is "+width+"X"+height+"X"+depth+"="+vol);
}
public static void main(String[] args)
{
SimpleBox object1=new SimpleBox();
object1.volume(20.0f,30.8f,90.6f);
SimpleBox object2=new SimpleBox();
object1.volume(26.8f,60.6f,70.3f);
}
}