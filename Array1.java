
class Array_obj1
{
    public static void main(String arg[])
    {
        int[] arr1=new int[]{1,2,3,4,5,6,7};//old array initialization with list
        int[] arr2={7,9,10}; //new way of declearing array

        for(int i =0;i<arr1.length;i++)
        {
            System.out.println("old array element :"+arr1[i]);
        }

        for(int i =0;i<arr2.length;i++)
        {
            System.out.println("New array element :"+arr2[i]);
        }
    }
}