public class Main
{
	public static void main(String[] args)
	{
		Object lock = new Object();

	    Worker t1 = new Worker("Worker 1", lock);
	    Worker t2 = new Worker("Worker 2", lock);
	    t1.start(); //does not block
	    t2.start(); //does not block
	}
}
