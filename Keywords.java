
class Keywords
{
    public static void main(String arg[])
    {
        Derived obj = new Derived(10,20,9,8);
        obj.gun();
    }
}

class Base 
{
    public int A,B;
    public Base(int k,int l)
    {
        System.out.println("Inside base Constructor");
        this.A=k;
        this.B=l;
    }
    public void fun()
    {
        System.out.println("Inside fun of Base");
    }
}

class Derived extends Base
{
    public int X,Y;
    public Derived(int k, int l,int i,int j)
    {
        super(k,l);
        System.out.println("Inside the Derived class");
        this.X=i;
        this.Y=j;
    }
    public void gun()
    {
        System.out.println("Inside gun");
        super.fun();
        System.out.println("Value of A : "+super.A);
        System.out.println("Value of B : "+super.B);
    }
}