package LambdaExpression.TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapUsingLambda {
	 public static void main(String a[]){
	        //By using name comparator (String comparison)
	        TreeMap<Empl,String> tm = new TreeMap<Empl, String>((e1, e2)-> e1.getName()
	        		.compareTo(e2.getName()));
	        tm.put(new Empl("Ram",3000), "RAM");
	        tm.put(new Empl("John",6000), "JOHN");
	        tm.put(new Empl("Crish",2000), "CRISH");
	        tm.put(new Empl("Tom",2400), "TOM");
	        Set<Empl> keys = tm.keySet();
	        for(Empl key:keys){
	            System.out.println(key+" ==> "+tm.get(key));
	        }
	        System.out.println("===================================");
	        //By using salary comparator (int comparison)
	        TreeMap<Empl,String> trmap = new TreeMap<Empl, String>
	        ((o1, o2)->o1.getSalary().compareTo(o2.getSalary()));
	        trmap.put(new Empl("Ram",3000), "RAM");
	        trmap.put(new Empl("John",6000), "JOHN");
	        trmap.put(new Empl("Crish",2000), "CRISH");
	        trmap.put(new Empl("Tom",2400), "TOM");
	        Set<Empl> ks = trmap.keySet();
	        for(Empl key:ks){
	            System.out.println(key+" ==> "+trmap.get(key));
	        }
	    }

}
class Empl{
    
    private String name;
    private Integer salary;
     
    public Empl(String n, Integer s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}

