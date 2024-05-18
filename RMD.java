class RMD
{
    public static void main(String arg[])
    {
        Base dobj =new Derived();
        dobj.Fun(); //Base
        dobj.Gun(); //Derived
        dobj.Sun(); //Base
        dobj.Run();//Derived
        dobj.Mun();//Error
    }
}

class Base
{
    public int A,B;
    void Fun(){System.out.println("Base Fun");}

    void Gun(){System.out.println("Base Gun");}

    void Sun(){System.out.println("Base Sun");}

    void Run(){System.out.println("Base Run");}
    
}

class Derived extends Base
{
    public int X,Y;
    void Gun()
    {
        System.out.println("Inside Derived Gun");
    }

    void Run(){System.out.println("Base Run");}

    void Mun(){System.out.println("Base  Mun");}
}
