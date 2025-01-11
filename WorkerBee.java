public class WorkerBee extends Thread
{
    private WorkerBee theOtherThread;
    private String name;
    
    public WorkerBee(String name, WorkerBee theOtherThread)
    {
        this.theOtherThread = theOtherThread;
        this.name = name;
    }
    
    //overriding the default run method we inherited from Thread
    public void run()
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
            System.out.println(this.name + " Working");
        }
        
        System.out.println(this.name + " Done!");

    }
}