package Demo;
class my_thread1 extends Thread implements Runnable
{
	public void run()
	{
	    
		try
		{
		    System.out.println("Hello");
		    sleep(1000);
		}catch(Exception e){}
	}
}
class my_thread2 extends Thread implements Runnable
{
	@Override
	public void run()
	{
	    
	    try
	    {
	        System.out.println("Hii");
			sleep(3000);
		}catch(Exception e){}
	}
}
class my_thread3 implements Runnable
{
	@Override
	public void run()
	{
	    System.out.println("How are you");
	}
}
public class Thread_Assignment_1 {

	public static void main(String[] args) {
		my_thread1 m1 = new my_thread1();
		my_thread2 m2 = new my_thread2();
		my_thread3 m3 = new my_thread3();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		t1.start();
		t2.start();
		t3.start();

	}

}
