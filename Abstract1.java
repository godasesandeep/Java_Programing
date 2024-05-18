
class Abstract1
{
    public static void main(String Arg[])
    {
        Derived obj = new Derived();

        System.out.println(obj.Addition(20,10));
        System.out.println(obj.Substraction(20,10));
        System.out.println(obj.Multiplication(20,10));
        System.out.println(obj.Division(20,10));
    
    }
}

abstract class Demo
{
    public int Addition(int a,int b){return a+b;}

    public int Substraction(int a,int b){return a-b;}

    public abstract int Multiplication(int a,int b);
}

class Derived extends Demo
{
    public int Division(int a, int b)
    {return a/b;}

    public int Multiplication(int a,int b){return a*b;}

}