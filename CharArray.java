import java.util.*;

class CharArray
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the name");
       String name = sobj.nextLine();
       char Arr[] = name.toCharArray();

       System.out.println("Array length is "+ Arr.length);
       System.out.println("Array length is "+ name.length());
    }
}