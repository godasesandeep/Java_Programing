
class MultiThread1
{
    public static void main(String arg[])
    {
        System.out.println("Current Tread Name is  : "+Thread.currentTread().getName());
        Demo obj1 =new Demo();
        Demo obj2 = new Demo();

        obj1.setNmae("PPA");
        obj2.setName("LB");

        obj1.start();
        obj2.start();
    }

}

class Demo extends Thread
{
    public void run()
    {
        int i=0;
        String name = Thread.currentThread().getName();
        for(i=0;i<100;i++)
        {
            System.out.println("Running Tread : "+name+"With value : "+i);
        }
    }
}



