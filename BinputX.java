
import java.io.*;

class BinputX
{
    public static void main(String Arg[])
    {
        try
        {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj =new BufferedReader(iobj);

        //BufferedReader bobj =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your Name");

        String name = bobj.readLine();

        System.out.println("Welcome :"+name);
        }
        catch(IOException obj)
        {
            
        }
    }
}