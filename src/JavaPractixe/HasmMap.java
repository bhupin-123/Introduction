package JavaPractixe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasmMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(0,"hello");
		hm.put(1,"goodbye");
		hm.put(2,"goodmorning");
		
		Set sn= hm.entrySet();// Hashmap has been converted to set, now after converting, hm has been stored in sn. 
		//SN has different indexes 0,1 and so on. so key-values of hm are stored at different indexes 0,1,2 etc. in sn 
		
		Iterator it=sn.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp=(Map.Entry)it.next();// Cast with Map.Entry to separate key and values
			mp.getKey();
			mp.getValue();
			
		}
		
		
	}

}
