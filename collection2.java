//ArrayList
import java.util.*;

class collection2
{

    public static void main(String arg[])
    {

        ArrayList<String> lobj = new ArrayList<String>();

        lobj.add("PPA");
        lobj.add("LB");
        lobj.add("Python");
        lobj.add("LB++");

        System.out.println(lobj);
        lobj.addFirst("C++");
        System.out.println(lobj);

        for(String str: lobj)
        {
            System.out.println(str);
        }
    }
}