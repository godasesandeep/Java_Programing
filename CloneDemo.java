
class CloneDemo
{
    public static void main(String Arg[])
    {
        try
        {
        Student sobj = new Student("Amit",87,25);
        System.out.println("Name of Student : "+sobj.Name);
        System.out.println("Marks of Student : "+sobj.Marks);
        System.out.println("Age of Student : "+sobj.Age);

        Student sobjX = (Student)sobj.clone(); //(Student) type casting
        System.out.println("Name of Student : "+sobjX.Name);
        System.out.println("Marks of Student : "+sobjX.Marks);
        System.out.println("Age of Student : "+sobjX.Age);

        }
        catch(Exception obj)
        {

        }
    }
}

class Student implements Cloneable
{
    public String Name;
    public int Marks;
    public int Age;

    public Student(String str, int A,int B)
    {
        this.Name=str;
        this.Marks=A;
        this.Age=B;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}