package BasicJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		 
        // Add elements using put method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        
        HashMap<String, Integer> map2 = new HashMap<>();
		 
        // Add elements using put method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("vaibhav1", 201);
        
        for(Map.Entry<String, Integer> e: map.entrySet())
        {
        	System.out.println(e.getKey()+" "+e.getValue());
        }
        
        HashMap<String, Integer> map1= new HashMap<>();
        
      map1.putAll(map);
      
      System.out.println(map1);
      
      System.out.println(map.containsKey(map2));    
      
      List<Integer> list= new ArrayList<>();
      Set<Integer> set= new HashSet<Integer>();
      list.add(1);
      list.add(33);
      list.add(24);
      list.add(24);
      list.add(2);
      list.add(4);
      
      Iterator it= list.iterator();
      
      while(it.hasNext())
      {
    	  System.out.print(it.next());
    	  
      }
      set.addAll(list);
      
      System.out.println(list);
      Collections.sort(list);
      
      System.out.println(list);
      System.out.println(set);
      
    //declare hashmap
      String str="sushil sawai";
      HashMap<Character, Integer> count = new HashMap<Character, Integer>();

      //convert string to character array
      char[] arr = str.toCharArray();

      //traverse every character and count the Occurrences
      for(char c:arr){

        //filter out white spaces
        if(c != ' '){
          if(count.containsKey(c)){
            //if character already traversed, increment it
            count.put(c, count.get(c) + 1);
          }else{
            //if character not traversed, add it to hashmap
            count.put(c,1);
          }
        }
        
      }
      System.out.print(count);
     
     
     
        
 
	}

}
