package LambdaExpression;

public class Greeter
{
	public void greetMethod(Greeting helloWorld)
	{
		helloWorld.perform();
	}
	public static void main(String[] args) {
		Greeting  greet = new HelloWorld();
		
		Greeter greeter= new Greeter();
		
		
		Greeting myLammdaExpression = ()->
		{
			System.out.println("Jai Shri Ram");
		};
		myLammdaExpression.perform();
		greeter.greetMethod(myLammdaExpression);
	}

}
