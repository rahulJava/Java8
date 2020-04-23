package LambdaExpression;

public class RunnableExample 
{
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Print inside runnable class");
				// TODO Auto-generated method stub
				
			}
		});
		myThread.run();
		
		Thread myLambdaThread = new Thread(()-> System.out.println("Print inside runnable class"));
		
		myLambdaThread.run();
	}

}
