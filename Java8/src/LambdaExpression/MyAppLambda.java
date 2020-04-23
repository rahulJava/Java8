package LambdaExpression;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyAppLambda {

	public static void main(String[] args) {
		List<Person> list =Arrays.asList(
			new Person("Shiv", "Shambhu"),
			new Person("Shri", "Ganesh"),
			new Person("Lord", "Ram")
				);
		
		//list.forEach(p->System.out.println(p.getFirstName()));
		list.stream().filter(p->p.getLastName().startsWith("G")).forEach(p->System.out.println(p));
		//list.stream().filter(p->p.getLastName().startsWith("G")).
//		Collections.sort(list,( p1, p2)->p1.getLastName().compareTo(p2.getLastName()));
//		
//		printConditionally(list , (p)->true);
//		
//		printConditionally(list , (p)->p.getFirstName().startsWith("S"));
//		
		
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
