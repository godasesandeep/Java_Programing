import java.io.*;

class StringBuffer_capacity
{
    public static void main(String arg[])
    {
        StringBuffer sb = new StringBuffer();

        int cap1=sb.capacity();//Default 16 char
        System.out.println("Default Capacity of String builder is :"+cap1);

        sb.append("Hello");
        sb.append(" World");
        System.out.println(sb);

        int cap3=sb.capacity();//Now 16 char
        System.out.println("Capacity of String builder is :"+cap3);

        sb.append(" I am learning java");
        System.out.println(sb);

        int cap7=sb.capacity();//Now 16 char
        System.out.println("Capacity increased to (oldcapacity*2)+2=16*2+2=34 of String builder is :"+cap7);
        
    }
}