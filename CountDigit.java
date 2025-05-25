import java.util.Scanner;

class CountDigit
{
    public static int countDig(int num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String arg[])
    {
        int no1;
        Scanner sobj =new Scanner(System.in);
        System.out.println("Enter First Number : ");
        no1=sobj.nextInt();
        
        System.out.println("number of digit  is : "+countDig(no1));
    }
}