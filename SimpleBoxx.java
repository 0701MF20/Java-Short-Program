class SimpleBoxx
{
float width; 
float height;
float depth;
public float volume(float wid,float high,float deep)
{
float vol;
width=wid;
height=high;
depth=deep;
return width*height*depth;

}
public static void main(String[] args)
{
SimpleBoxx object1=new SimpleBoxx();
float vol1,vol2;
vol1=object1.volume(20.0f,30.8f,90.6f);
System.out.println("Volume is "+vol1);
SimpleBoxx object2=new SimpleBoxx();
vol2=object1.volume(26.8f,60.6f,70.3f);
System.out.println("Volume is "+vol2);
}
}