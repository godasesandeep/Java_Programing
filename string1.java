
class string1
{
    public static void main(String arg[])
    {
        
        
        // 1. String literal
        String s4="Ashwini";
        System.out.println(s4);

        //2. Using new keyword
        String s5= new String("Sandeep");
        System.out.println(s5);

        //String constructor
        //3. String(byte arr[],int start_index,int lenght)
        byte arr[]={70,71,72,73,74,75,76};

        String brr=new String(arr,0,6); 
        System.out.println(brr);

        String brr2=new String(arr,2,4); 
        System.out.println(brr2);

        //4.String(char arr[])
        char carr[]={'A','s','w','i','n','i'};
        String brr1=new String(carr); 
        System.out.println(brr1);

        //5.String(char[] char_array, int start_index, int count)
        char char_arr[] = {'G', 'e', 'e', 'k', 's','G'};
        String s = new String(char_arr , 2, 4); //eek
        System.out.println(s);

        //6.String(StringBuffer s_buffer)
        StringBuffer s_buffer = new StringBuffer("Geeks");
        String s1 = new String(s_buffer); //Geeks
        System.out.println(s1);

        //7.String(StringBuilder s_builder)
        StringBuilder s_builder = new StringBuilder("Geeks");
        String s3 = new String(s_builder); //Geeks
        System.out.println(s3);

        int[] irr={70,71,91,73,74,75,76};

        String ibrr=new String(irr,0,6); 
        System.out.println(ibrr);
    }
}