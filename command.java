
class command
{
    public static void main(String arg[])
    {
        System.out.println("Number of command line arg is : "+arg.length);
        for(int i=0;i<arg.length;i++)
        {
            System.out.println(arg[i]);
        }
    }
}