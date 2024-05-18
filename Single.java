class Single
{
    public static void main(String arg[])
    {
        Derived dobj =new Derived();
        dobj.Fun();
        dobj.Gun();
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
