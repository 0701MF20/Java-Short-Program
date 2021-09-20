class StudentInfo
{
private int rollno;
private String name;
StudentInfo(int rollno,String name)
{
this.rollno=rollno;
this.name=name;
}
public void setRollno(int rollno)
{
this.rollno=rollno;
}
public void setName(String name)
{
this.name=name;
}
public int getRollno()
{
return rollno;
}
public String getName()
{
return name;
}
public static void main(String[] args)
{
StudentInfo object1=new StudentInfo(23,"Rahul");
System.out.println("Roll no: "+object1.getRollno()+"\n"+"Name: "+object1.getName());
}
}