import java.net.*;
import java.io.*;

class server
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("server Application is running...");

        ServerSocket ssobj =new ServerSocket(2100);
        System.out.println("Server is wating for client...");

        Socket sobj = ssobj.accept();
        System.out.println("Client get Successfuly Connected ....");

        PrintStream ps =new PrintStream(sobj.getOutputStream());
        BufferedReader br1 =new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 =new BufferedReader(new InputStreamReader(System.in));
        String str1,str2;

        System.out.println("Messanger started server....");

        while((str1=br1.readLine())!=null)
        {
            System.out.println("Client Says : "+str1);
            System.out.println("Enter the message for client : ");
            str2=br2.readLine();
            ps.println(str2);
        }
        System.out.println("Thank you using the server : ");
    }
}