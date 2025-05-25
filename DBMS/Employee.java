import java.util.*;

class Employee
{
    public static void main(String arg[])
    {
        System.out.println("------ DBMS Managment System --------");

        CustoDBMS cobj= new CustoDBMS();

        cobj.insertIntoTable("Sandeep","Pune",500000000);
        cobj.insertIntoTable("Ashwini","Pune",80000000);
        cobj.insertIntoTable("Bapu","Pune",90000000);
        cobj.insertIntoTable("Chiku","Pune",70000000);

        cobj.selectStar();

        cobj.searchRecord(3);

        cobj.searchRecord("Chiku");

        cobj.deleteFromTable(3);

        cobj.deleteFromTable("Ashwini");

        cobj.selectStar();

        cobj.aggregateSum();

        cobj.aggregateMax();

    }
}

class Employee1
{
    public int id;
    public String name;
    public String address;
    public int salary;

    private static int Counter;
    static
    {
        Counter=0;
    }

    public Employee1(String b,String c , int d)
    {
        this.id= ++Counter;
        this.name=b;
        this.address=c;
        this.salary=d;
    }

    void displayInfo()
    {
        System.out.println("Employe ID "+id+"  Name :"+name+ "   Address : "+address+"  Salary : "+salary);
    }
}
class CustoDBMS
{
    public LinkedList<Employee1> lobj;
    public CustoDBMS()
    {
        System.out.println("CustoDBMS Started sucessfuly....");
        lobj = new LinkedList<Employee1>();
    }

    public void insertIntoTable(String name1,String address1,int salary1)
    {
        Employee1 eobj = new Employee1(name1,address1,salary1);
        lobj.add(eobj);
    }

    //select * from Employee1

    public void selectStar()
    {
        System.out.println("Data from the Employee1 DataBase ...... ");
        for(Employee1 eref : lobj)
        {
            eref.displayInfo();
        }
    }

    //Select * from employee where id =3
    public void searchRecord(int id1)
    {
        for(Employee1 eref : lobj)
        {
            if(eref.id==id1)
            {
                eref.displayInfo();
                break;
            }
        }
    }

    //Select * from employee where name ="Chikku"
    public void searchRecord(String Name)
    {
        for(Employee1 eref : lobj)
        {
            if(Name.equals(eref.name))
            {
                eref.displayInfo();
                
            }
        }
    }

    //delete from Employee Where id=3
    public void deleteFromTable(int id)
    {
        int index=0;
        boolean bflag=false;

        for(Employee1 eref : lobj)
        {
            if(eref.id==id)
            {
                bflag=true;
                break;
            }
            index++;
        }
        if(bflag==false)
        {
            System.out.println("Id not present");
        }
        else
        {
            lobj.remove(index);
        }
    }


    //delete from Employee Where name="Ashwini"
    public void deleteFromTable(String name1)
    {
        int index=0;
        boolean bflag=false;

        for(Employee1 eref : lobj)
        {
            if(name1.equals(eref.name))
            {
                bflag=true;
                break;
            }
            index++;
        }
        if(bflag==false)
        {
            System.out.println("name not present");
        }
        else
        {
            lobj.remove(index);
        }
    }

    //Select sum(salary) from Employee1
    public void aggregateSum()
    {
        int sum=0;
        for(Employee1 eref :lobj)
        {
            sum =sum + eref.salary;
        }
        System.out.println("Aggregate sum of :"+sum);
    }

    public void aggregateMax()
    {
        int imax=0;
        for(Employee1 eref : lobj)
        {
            if(eref.salary>imax)
            {
                imax=eref.salary;
            }
        }

        System.out.println("Max salary is : "+imax);
    }
}