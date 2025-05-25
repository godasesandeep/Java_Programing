class Student
{
    public int Roll_no;
    public String Name;
    Student(int no,String name) //public Student(int no ,String name)-->not allowed due to public keyword
    {
        this.Roll_no=no;
        this.Name=name;
    }
     
}


class Array_obj
{
    public static void main(String arg[])
    {
        Student[] stdA =new Student[5];

        stdA[0]=new Student(1,"Ashwini");
        stdA[1]=new Student(2,"Sandeep");
        stdA[2]=new Student(3,"Rudra");
        stdA[3]=new Student(4,"Avinda");
        stdA[4]=new Student(5,"Raosaheb");

        for(int i=0;i<stdA.length;i++)
        {
            System.out.println("Student at index :"+i
            +" Roll number "+stdA[i].Roll_no+" Name "+stdA[i].Name);
        }

        
    }
}

