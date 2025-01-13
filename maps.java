package tutorial;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class main {
	
	public static void main(String[] args) {
		
		
		Map m  = new HashMap();
		m.put("tim", 5);
		m.put("joe", 6);
		m.put("kelly", 20);
		
		System.out.println(m);
		System.out.println(m.get("tim"));
		
		
		Map t = new TreeMap();
		t.put(6, "Saturn");
		t.put(5,"Jupiter");
		t.put(7,"Uranus");
		
		System.out.println(t);
		
		
		// LInked HashMap
		Map l = new LinkedHashMap();
		
		l.put("Manager", "Margaret");
		l.put("CEO", "James Cameroon");
		l.put("secretary", "Dona Tovalds");
		
		System.out.println(l);
		
		
		// maps method
		
		System.out.println(l.values()); // returns a list of values
		
//		;
		System.out.println(t.containsKey(7));
		System.out.println(t.containsValue("Mars"));
		System.out.println(t.isEmpty());
		
		// use of maps
		Map i = new HashMap();
		String greet = "Hello my name is Star and I am hot";
		for (char x:greet.toCharArray())
		{
//			System.out.println(x);
			if(i.containsKey(x))
			{
				int old =  (int) i.get(x); // get returns the value
				i.put(x,old+1);
			}
			else
			{
				i.put(x, 1);
			}
		}
		System.out.println(i);
		
		i.remove(' ');
		
		System.out.println(i);
	}
}

