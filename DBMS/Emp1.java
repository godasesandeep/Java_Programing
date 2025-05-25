import java.util.*;

class Employee1{

    public static void main(String arg[])
    {
        LinkedList<Integer> lobj = new LinkedList<Integer>();
        lobj.add(11);
        lobj.add(21);
        lobj.add(31);
        lobj.add(51);

        System.out.println(lobj);
        System.out.println("Size of link list "+lobj.size());
        for(int no:lobj)
        {
         System.out.println(no);   
        }
    }
}