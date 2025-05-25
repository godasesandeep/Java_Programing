


class Array_from_method1
{
    public static void main(String arg[])
    {
        ArrayCreat obj=new ArrayCreat();
        int[] arr=obj.m1();
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}

class ArrayCreat
{
    public int[] m1() 
        {
            return new int[]{1,2,3,4};
        }
}

