class String_contains
{
    public static void main(String arg[])
    {
        String s=" Learn Share Learn ";
        Boolean out=s.contains("Share");//Returns true if string contains contains the given string.
        
        System.out.println(out); //true

        Boolean out1=s.contains("hare");
        System.out.println(out1); //true
    }
}