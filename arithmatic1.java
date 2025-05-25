import java.util.Scanner;

class arithmatic1
{
    public static void main(String arg[])
    {
        int no1,no2;
        Scanner sobj =new Scanner(System.in);
        System.out.println("Enter First Number : ");
        no1=sobj.nextInt();
        System.out.println("Enter First Number : ");
        no2=sobj.nextInt();
        Calculator obj = new Calculator(10,1);

        System.out.println("Addirion of two number is : "+obj.addition());
    }
}

class Calculator
{
    public int num1;
    public int num2;

    public Calculator(int A,int B)
    {
        num1=A;
        num2=B;
    }

    public int addition()
    {
        return num1+num2;
    }
}