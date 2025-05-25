
class Array_method_arg
{
    public static void main(String arg[])
    {
        int[] arr=m1();
        print1 obj=new print1();
        obj.printArray(arr);
    }
    public static int[] m1() //non-static method m1() cannot be referenced from a static context
                        // -if static keyword not used
        {
            return new int[]{1,2,3,4};
        }

}

class print1
{
    public void printArray(int[] arr)
    {
    for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}