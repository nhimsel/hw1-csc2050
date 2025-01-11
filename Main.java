public class Driver
{
	public static void main(String[] args)
	{
	   WorkerBee t1 = new WorkerBee("Mike", null);
	   WorkerBee t2 = new WorkerBee("Dave", t1);
	   t1.start(); //does not block
	   t2.start(); //does not block
	   
	}
}
