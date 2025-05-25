import java.util.*;


class HashMap1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENter the string ....");
        String str = sobj.nextLine();

        str =str.replaceAll(" ","");

        char Arr[]= str.toCharArray();

        HashMap<Character,Integer> hobj =new HashMap<Character,Integer>();

        int freq=0;

        for(char ch: Arr)
        {
            if(hobj.containsKey(ch))
            {
                freq = hobj.get(ch);
                hobj.put(ch,freq+1);
            }
            else
            {
                hobj.put(ch,1);
            }
        }

        System.out.println(hobj);

        Set<Character> setobj = hobj.keySet();

        System.out.println(setobj);

        int imax=0;
        char ch ='\0';

        for(char data :setobj) //for(char data :Arr)
        {
            System.out.println(data + "  Occures    "+ hobj.get(data) + " times ");

            if(hobj.get(data)>imax)
            {
                imax=hobj.get(data);
                ch=data;
            }

        }

        System.out.println(ch + "occuress max time is : " +imax);

    }
}