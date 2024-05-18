

class ArrayDemo1
{

    public static void main(String arg[])
    {
        //int arr[] = {10,20,30,40,50}; //Allowed

        //int arr[5] = {10,20,30,40,50}; //Not allowed ..initialization of element not allowed i.e [5]

        int arr[] = new int[] {10,20,30,40,50};

        System.out.println("Number of element in array : "+arr.length);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }

}