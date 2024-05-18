
class ArrayTry
{

    public static void main(String arg[])
    {
        int arr[][] ={{10,11,12,13},{14,15},{16,17,18,19,20}};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}