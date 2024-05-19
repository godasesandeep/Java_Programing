class String_compareTo
{
    public static void main(String arg[])
    {
        String s="Ashwini";
        String s2 = new String("Ashwini");
        String s3="ashwini";

        //Compares two string lexicographically.
        //out < 0  // s1 comes before s2
        //out = 0  // s1 and s2 are equal.
        //out > 0   // s1 comes after s2.

        int out=s.compareTo(s2); //Retuen 0
        System.out.println(out);

        //Compares string to another string, ignoring case considerations.
        int out1 = s.compareToIgnoreCase(s3);//Retuen 0
        System.out.println(out1); 
    }
}