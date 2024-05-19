import java.io.*;

class StringBuffer_insert
{
    public static void main(String arg[])
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");

        sb.insert(1," World "); //insert left of the given index
        //The insert() method inserts the given string with this string at the given position. 
        System.out.println(sb);
        
    }
}