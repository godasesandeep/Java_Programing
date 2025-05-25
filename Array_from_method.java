
class Array_from_method
{
    public static void main(String arg[])
    {
        int[] arr=m1();
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] m1() //non-static method m1() cannot be referenced from a static context
                        // -if static keyword not used
        {
            return new int[]{1,2,3,4};
            //or
            //return {1,2,3,4,5,6,7};
        }
}