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
        for (int count=0; count<1000; count++)
        {    
            if(theOtherThread != null)
            {
                System.out.println(this.name + " Waiting");
                try 
                {
                    this.theOtherThread.wait();
                } 
                catch(Exception e) 
                {
                    //Ignore this exception for now...
                }
            }
            else
            {
                System.out.println(this.name + " Working: " + count);
                if (count%2==0)
                {
                    System.out.println("Ping");
                }
                else
                {
                    System.out.println("Pong");
                }
            }
        }
        System.out.println(this.name + " Done!");

    }
}