

class OOP
{
    public static void main(String arg[])
    {
        Arithmatic obj1= new Arithmatic();
        Arithmatic obj2 =new Arithmatic(21,11);
        int ret=0;
        ret = obj2.Addition();
        System.out.println(ret);

        ret = obj2.Substraction();
        System.out.println(ret);
    }
}

class Arithmatic
{
    public int a;
    public int b;

    public Arithmatic()
    {
        System.out.println("Inside default constructor");
        this.a=0;
        this.b=0;
    }

    public Arithmatic(int i, int j)
    {
        System.out.println("Inside Parameteric constructor");
        this.a=i;
        this.b=j;
    }
    public int Addition()
    {
        int ans =0;
        ans =this.a+this.b;
        return ans;
    }
    public int Substraction()
    {
        int ans=0;
        return a-b;
    }
}