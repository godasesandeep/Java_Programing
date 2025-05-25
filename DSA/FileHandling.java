import java.util.*;
import java.io.*;

class FileHandling

{

public static void main(String arr[]) throws Exception
{
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter the source file name that you want to create: ");

    String SFile_Name =obj.nextLine();

    System.out.println("Enter the Destination file name that you want to create: ");

    String DFile_Name =obj.nextLine();

    File sfobj =new File(SFile_Name);

    if(sfobj.exists())
    {
        File dfobj =new File(DFile_Name);
        boolean bret = dfobj.CreateNewFile();
        if(bret==false)
        {
        System.out.println("Unable to create the file :");
        return;
        }

        FileInputStream fobj = new FileInputStream(sfobj);
        FileInputStream fobj = new FileInputStream(dfobj);

        byte Buffer[] = new byte[1024];
        int iRet=0;
        while((iRet=fiobj.read(Buffer)))
        {
            foobj.write(Buffer,0,iret);
        }

    }
    else
    {
        fobj.CreateFile();

    }

}
}