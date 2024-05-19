class String_lastIndexOf
{
    public static void main(String arg[])
    {

        String s= "I am I I ";

        //Returns the index within the string of the last occurrence of the specified string.

        //If String s is not present in input string then -1 is returned as the default value.

        int output=s.lastIndexOf("I");
        System.out.println(output);


    }
}