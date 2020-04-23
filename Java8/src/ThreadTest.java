
public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		ThreadTest test = new ThreadTest();
		Thread t = new Thread(()->
		{
		test.m1();
		
		});
		
		Thread t1 = new Thread(()->
		test.m2 ());
		Thread t2 = new Thread(()->
		test.m3 ());
		
		t.start();
		
		t1.start();
		t2.start();
		
		
	}

	public static synchronized void m1()
	{
		System.out.println("inside m1");
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static synchronized void m2()
	{
		System.out.println("inside m2");
	}
	public  void m3()
	{

		System.out.println("inside m3");
	}
}
