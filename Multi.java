class Multi
{
    public static void main(String arg[])
    {
        DerivedX dobj =new DerivedX();
        dobj.Fun();
        dobj.Gun();
        dobj.Sun();
    }
}

class Base
{
    public int A,B;
    public Base()
    {
        System.out.println("Base Constructor");
    }

    void Fun()
    {
        System.out.println("Base Fun");
    }
}

class Derived extends Base
{
    public int X,Y;
    public Derived()
    {
        System.out.println("Derived Constructor");
    }
    void Gun()
    {
        System.out.println("Inside Derived Gun");
    }
}

class DerivedX extends Derived
{
    public int I,J;
    public DerivedX()
    {
        System.out.println("DerivedX Constructor");
    }
    void Sun()
    {
        System.out.println("Inside DerivedX Sun");
    }
}
