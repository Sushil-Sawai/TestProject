package BasicJava;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		 
        // Add elements using put method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        
        for(Map.Entry<String, Integer> e: map.entrySet())
        {
        	System.out.println(e.getKey()+" "+e.getValue());
        }
 
	}

}
