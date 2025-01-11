public class Main
{
	public static void main(String[] args)
	{
	   Worker t1 = new Worker("Worker 1", null);
	   Worker t2 = new Worker("Worker 2", t1);
	   t1.start(); //does not block
	   t2.start(); //does not block
	}
}
