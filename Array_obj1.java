

class Array_obj1
{
    public static void main(String arg[])
    {
        Student[] stdA ={new Student(1,"Ashwini"),new Student(2,"Sandeep"),
                            new Student(3,"Rudra"),new Student(4,"Avinda"),new Student(5,"Raosaheb")};

        for(Student m:stdA)
        {
            System.out.println(m);
        }

        
    }
}

class Student
{
    public int Roll_no;
    public String Name;
    Student(int no,String name) //public Student(int no ,String name)-->not allowed due to public keyword
    {
        this.Roll_no=no;
        this.Name=name;
    }

    @Override
    public String toString()
    {
        return "Roll number & student name is :"+Roll_no+"  "+Name;
    }
     
}

