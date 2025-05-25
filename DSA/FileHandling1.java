import java.util.*;
import java.io.*;

class FileHandling1

{

public static void main(String arr[]) throws Exception
{
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter the source file name that you want to create: ");

    String SFile_Name =obj.nextLine();

    File sfobj =new File(SFile_Name);

    if(sfobj.exists())
    {
        File Arr[] = sfobj.listFiles();
       
        System.out.println("Number of files is "+Arr.length );

        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i].getName()+ "  File size is :"+Arr[i].length());
        }
    }
    else
    {
        System.out.println("Directory not exist");

    }

}
}