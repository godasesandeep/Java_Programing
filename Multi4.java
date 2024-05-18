
class Multi4
{
    public static void main(String a[])
    {
        System.out.println("Current Tread is : "+Thread.currentThread().getName());
        Practice obj1 = new Practice();
        Practice obj2 = new Practice();

        obj1.setName("Ashwini");
        obj2.setName("Sandy");
        obj1.start();
        obj2.start();
    }
}

class Practice extends Thread
{
    public void run()
            {
                try{
                String name = Thread.currentThread().getName();
                int i=0;
                for(i=0;i<10;i++)
                {
                    System.out.println("Current Running Tread : "+name+ "  With value "+i);
                    Thread.sleep(2000);
                }
                }
                catch(Exception obj)
                {

                }
            }
    
    
}