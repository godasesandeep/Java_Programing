class MultiD_Array_Printing
{
    public static void main(String arg[])
    {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}