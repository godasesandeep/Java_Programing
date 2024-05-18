import java.util.Scanner;


class UserEx
{
    public static void main(String arg[])
    {
        try
        {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your age : ");

        int age =sobj.nextInt();

        if(age<18)
        {
            throw new AgeInvalid();
        }
        else
        {
            System.out.println("Sussessfuly logged in");
        }
        }
        catch(AgeInvalid obj)
        {
            System.out.println("Age invalid to register");
        }
    }
}

class AgeInvalid extends Exception
{
    
}