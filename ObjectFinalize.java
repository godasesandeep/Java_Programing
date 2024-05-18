
class ObjectDemo
{
    public static void main(String arg[])
    {
        Object obj = new Marvellous();
        System.out.println(obj.hashCode());
        obj=null;
        System.gc();
    }
}

class Marvellous
{
    public int i,j;

    public Marvellous()
    {
        System.out.println("Inside marvellous constructor");
    }

    protected void finalize()
    {
        System.out.println("Inside finalize");
    }
}