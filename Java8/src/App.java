import java.util.ArrayList;
import java.util.List;

public class App
{
	static ArrayList<Contact> list = new ArrayList<Contact>();
	static
	{
		list.add(new Contact(12345, "rahul"));
		list.add(new Contact(34567, "Amit"));
		
		list.add(new Contact(34578, "Shah"));
	}
	public static void main(String[] args) {
		
		System.out.println(list);
		System.out.println("-------------------------------");
		Contact c1=null;
		Contact c2=null;
		boolean isAli=false;
		for(Contact list1: list)
		{
			//System.out.println(list1);
//			if(list1.getName()=="Amit")
//			{
//			c1=list1;
//			}
//			if(list1.getName()=="rahul")
//			{
//				c2=list1;
//			}
			if(list1.getName()!="Ali")
			{
					isAli=true;
				
			}
			
			
		}
		//c1.setMobileNo(98978787);
		//c2.setName("rahul ratra");
		//list.remove(c1);
		if(isAli)
		{
			System.out.println("Ali is not there");
		}
		System.out.println(list);
	}

}
