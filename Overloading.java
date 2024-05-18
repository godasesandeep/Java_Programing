
class Overloading
{
    public static void main(String arg[])
    {
        Demo dobj = new Demo();
        int iRet=0;
        double dRet=0.0;

        iRet=dobj.Addition(10,20);
        System.out.println(iRet);
        iRet =dobj.Addition(10,20,30);
        System.out.println(iRet);
        dRet = dobj.Addition(10.0,20.0);
        System.out.println(dRet);
        dRet = dobj.Fun(10,20.0);
        System.out.println(dRet);


    }
}

class Demo
{
    public int Addition(int a,int b){return a+b;}

    public int Addition(int a,int b,int c){return a+b+c;}

    public double Addition(double a,double b){return a+b;}

    public double Fun(int a, double b){return a+b;}
}
