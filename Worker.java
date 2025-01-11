public class Worker extends Thread
{
    private Worker theOtherThread;
    private String name;
    
    public Worker(String name, Worker theOtherThread)
    {
        this.theOtherThread = theOtherThread;
        this.name = name;
    }
    
    //overriding the default run method we inherited from Thread
    public void run()
    {
        for (int count=0; count<100; count++)
        {
            {
                if (count%2==0)
                {
                    System.out.println(this.name + ": Ping: " + count);
                }
                else
                {
                    System.out.println(this.name + ": Pong: " + count);
                }
            }
            try
            {
                this.sleep(1);
            }
            catch (Exception e)
            {
                //ignore
            }
        }
    }
}