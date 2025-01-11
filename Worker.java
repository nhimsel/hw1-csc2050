public class Worker extends Thread
{
    final Object lock;
    private String name;
    
    public Worker(String name, Object lock)
    {
        this.lock = lock;
        this.name = name;
    }
    
    //overriding the default run method we inherited from Thread
    public void run()
    {
        int count = 0;
        int max = 1000;
        while (count<max)
        {
            synchronized (this.lock)
            {
                if (count%2==0)
                {
                    System.out.println(this.name + ": Ping");
                }
                else
                {
                    System.out.println(this.name + ": Pong");
                }
                count++;
                this.lock.notify();
                try
                {
                    if (count<max) this.lock.wait();
                }
                catch (Exception e)
                {/* ignore */}
            }
        }
    }
}