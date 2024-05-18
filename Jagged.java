
class Jagged
{

    public static void main(String arg[])
    {
        int arr[][] = new int[3][];
        arr[0]=new int[4];
        arr[1]= new int[2];
        arr[2]= new int[5];

        arr[0][0]=10;
        arr[0][1]=11;
        arr[0][2]=12;
        arr[0][3]=13;

        arr[1][0]=14;
        arr[1][1]=15;

        arr[2][0]=16;
        arr[2][1]=17;
        arr[2][2]=18;
        arr[2][3]=19;
        arr[2][4]=20;

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