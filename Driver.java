/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
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
