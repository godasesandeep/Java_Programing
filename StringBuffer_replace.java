import java.io.*;

class StringBuffer_replace
{
    public static void main(String arg[])
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");

        sb.replace(1,3,"World"); //HWorldlo
        //The replace() method replaces the given string from the specified beginIndex and endIndex-1.
        System.out.println(sb);
        
    }
}