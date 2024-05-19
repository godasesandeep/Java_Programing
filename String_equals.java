class String_equels
{
    public static void main(String arg[])
    {
        String s="Ashwini";
        String s2 = new String("Ashwini");
        String s3="ashwini";

        //Compares string to another string
        Boolean b=s.equals(s2); //Retuen true
        System.out.println(b);

        //Compares string to another string, ignoring case considerations.
        Boolean b1 = s.equalsIgnoreCase(s3);
        System.out.println(b1); //Retuen true
    }
}