import java.util.Scanner;

class SumEvenDig
{
    public static int sumEvenDig(int num)
    {
        int iDgt=0,isum=0;
        while(num!=0)
        {
            iDgt=num%10;
            if(iDgt%2==0)
            {
                isum=isum+iDgt;
            }
            num=num/10;
        }
        return isum;
    }
    public static void main(String arg[])
    {
        int no1;
        Scanner sobj =new Scanner(System.in);
        System.out.println("Enter First Number : ");
        no1=sobj.nextInt();
        
        System.out.println("add of even digit  is : "+sumEvenDig(no1));
    }
}