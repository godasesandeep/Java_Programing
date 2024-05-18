import java.net.*;
import java.io.*;

class client
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Client Application is running...");


        Socket sobj = new Socket("localhost",2100);
        System.out.println("Client gets connected....");

        PrintStream ps =new PrintStream(sobj.getOutputStream());
        BufferedReader br1 =new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));
        String str1,str2;

        System.out.println("Messanger started client....");
        while(!(str1=br2.readLine()).equals("end"))
        {
            ps.println(str1);
            str2=br1.readLine();
            System.out.println("Enter the massage for Server :");
            System.out.println("Server Says : "+str2);
        }
        System.out.println("Thank you for using messanger");
    }
}