import java.util.*;

public class CollectionsDemo{
	public static void main(String args[]){
	List a1 = new ArrayList();
	a1.add("John");
	a1.add("Jenny");
	a1.add("Richard");
	System.out.println("Use Araylist of more get than put operations");
	System.out.println("Arraylist Elements");
	System.out.println("\t" + a1);

	List l1 = new LinkedList();
	l1.add("John");
	l1.add("Jenny");
	l1.add("Richard");
	System.out.println("Use LinkedLIst if more put than get operations");
	System.out.println("LinkedList Elements");
	System.out.println("\t"+ l1);

	Set<String> s1 = new HashSet();
	s1.add("John");
	s1.add("Jenny");
	s1.add("Richard");
	System.out.println("Cannot contain duplicate elements");
	System.out.println("Set Elements");
	System.out.println("\t"+ s1);

	Map m1 = new HashMap();
	m1.put("John", "8");
  m1.put("Jenny", "31");
  m1.put("Richard", "12");
  m1.put("Daisy", "14");
  System.out.println();
  System.out.println(" Map Elements");
  System.out.print("\t" + m1);

  System.out.println("\n"+"ArrayList contains(John)");
  System.out.println("\t"+a1.contains("John"));
  System.out.println("");

  List a2 = new ArrayList();
	a2.add("John");
	a2.add("Jenny");
	a2.add("Richard");
	System.out.println("a2's hashcode is exactly the same as a1? (same values inside)");
	System.out.println(a2.hashCode() == a1.hashCode());
}

}