import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
		
 java.util.HashMap hashmapobj = new java.util.HashMap<>();
 hashmapobj.put("abwsh", 1);
 hashmapobj.put("bsw", 100);
 Object ref1=hashmapobj.put("abwsh", 300);
 Object ref2=hashmapobj.put("c", 300);
 System.out.println(hashmapobj);
 System.out.println(ref1);
 System.out.println(ref2);
 Set a=hashmapobj.keySet();
 System.out.println("key sets are"+a);
 System.out.println("values are"+hashmapobj.values());
 Set b=hashmapobj.entrySet();
 System.out.println("Entries are"+b);
 Iterator<Object> itr=b.iterator();
 while(itr.hasNext()){
	 Map.Entry e1= (Map.Entry)itr.next();
	 System.out.println(e1.getKey()+" "+e1.getValue());
 }
 


	}

}
