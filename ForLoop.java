
class ForLoop
{
    public static void main(String Arg[])
    {
        int arr[] ={10,20,30,40,50};

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("___________________________________");

        int i=0;
        while(i<arr.length)
        {
            System.out.println(arr[i]);
            i++;
        }
    }
}