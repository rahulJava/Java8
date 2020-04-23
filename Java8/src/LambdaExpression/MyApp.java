package LambdaExpression;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyApp {

	public static void main(String[] args) {
		List<Person> list =Arrays.asList(
			new Person("Rahul", "Ratra"),
			new Person("Shiv", "Shambhu"),
			new Person("Shri", "Ganesh"),
			new Person("Lord", "Ram")
				);
		
		Collections.sort(list,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		
		printConditionally(list , new Condition() {
			
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getFirstName().startsWith("S");
			}
		});
		
		
	}

static void printConditionally(List<Person> list, Condition condition)
{
	for(Person p1:list)
	{
		if(condition.test(p1))
		{
		System.out.println(p1);
		}
	}
}


}
interface Condition
{
	 boolean test(Person p); 
}