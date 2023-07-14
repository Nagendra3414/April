package collections_;

import java.util.HashMap;
import java.util.Map;

public class Map__ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(10, "testing 10");

		hm.put(20, "testing 20");

		hm.put(30, "testing 30");

		hm.put(40, "testing 40");
		
		
		for(int a: hm.keySet())
		{
			//System.out.println(a);
		}
		
		for(String b: hm.values())
		{
			//System.out.println(b);
		}
		
		
		for(Map.Entry<Integer, String> c: hm.entrySet())
		{
			System.out.println(c.getKey());
			System.out.println(c.getValue());
		}
	}

}
