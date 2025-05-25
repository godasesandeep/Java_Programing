import java.util.*;


class HashMap2
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("ENter the string ....");
        String str = sobj.nextLine();

        str =str.trim();
        str =str.replaceAll("\\s+"," ");
        String Arr[]=str.split(" ");

        

        //char Arr[]= str.toCharArray();

        HashMap<String,Integer> hobj =new HashMap<String,Integer>();

        int freq=0;

        for(String ch: Arr)
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



        Set<String> setobj = hobj.keySet();

        System.out.println(setobj);

        int imax=0;
        String ch =null;

        for(String data :setobj) //for(String data :Arr)
        {
            System.out.println(data + "  Occures    "+ hobj.get(data) + " times ");

           if(hobj.get(data)>imax)
            {
                imax=hobj.get(data);
                ch=data;
            }
            

        }

        System.out.println(ch + " occuress max time is : " +imax);

    }
}