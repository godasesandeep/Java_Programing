
class StringCompair
{
    public static void main(String arg[])
    {
        String s1="Hello";
        String s2="Demo";
        String s3=new String("Hello");
        String s4="Hello";

        if(s1==s4)
        {
            System.out.println("S1 and S4 are Same");

        }

        if(s1==s3)
        {
            System.out.println("S1 and S3 are Same");

        }

        if(s1.equals(s3))
        {
            System.out.println("S1 and S3 are Same as equals method");

        }
    }
}