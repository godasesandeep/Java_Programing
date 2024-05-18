
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

        System.out.println("Enter your 1 Number");
        int no1=Integer.parseInt(bobj.readLine());

        System.out.println("Enter your 2 Number");
        int no2=Integer.parseInt(bobj.readLine());

        int Ans=no1+no2;

        System.out.println("Addition :"+Ans);
        }
        catch(IOException obj)
        {
            
        }
    }
}