package CollectionDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CollectionsBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer,String> map= new HashMap<> ();
		map.put(1, "sushil");
		map.put(2,"sawai");
		
		System.out.print(map);
		
		System.out.println(map.entrySet());
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("sawai"));
		System.out.println(map.values());
		System.out.println(map.keySet());
		
		for(int i: map.keySet())
		{
			System.out.println(i);
		}
		
		for(String j: map.values())
		{
			System.out.println(j);
		}
		
		
		
		
		
	}

}
