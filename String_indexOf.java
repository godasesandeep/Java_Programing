
class String_indexOf
{
    public static void main(String arg[])
    {
        //Returns the index within the string of the first occurrence of the specified string.

        //If String s is not present in input string then -1 is returned as the default value.

        String s="I am learning string topic in java";

        int indx= s.indexOf("topic");

        System.out.println(indx);


        //int indexOf (String s, int i)
        //Returns the index within the string of the first occurrence of the specified string,
        // starting at the specified index.


        String s2 = "Learn Share Learn";
        int output1 = s2.indexOf("ea",3);// returns 13
        int output2 = s2.indexOf("ea",0);// returns 1

        System.out.println(output1);
        System.out.println(output2);
    }
}