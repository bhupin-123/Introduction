package JavaPractixe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class class1 {
	public static void main() {
		demo1();
		
		
	}

	
	static public void demo1() {
		System.out.println("demo1");
	}
	
	public void demo3() {
		HashSet<String> ids = new HashSet<String>();	
		ids.add("D");
		ids.add("C");
		ids.add("K");
		ids.add("A");
		System.out.println(ids);
		ArrayList<String> a=new ArrayList<String>(ids);
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		a.add("A");
		System.out.println(a);
	}
	
}
