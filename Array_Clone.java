
class Array_Clone
{
    public static void main(String arh[])
    {
        int[] arr={1,2,3,4,5,6,7};

        int[] arrCopy =arr.clone();

        System.out.println(arr==arrCopy);//return false as deep copy created
        for(int i=0;i<arrCopy.length;i++)
        {
            System.out.print(arrCopy[i]+" ");
        }
    }
}