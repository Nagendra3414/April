package collections_;

import java.util.HashMap;

public class Map_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(10, "testing 10");

		hm.put(20, "testing 20");

		hm.put(30, "testing 30");

		hm.put(40, "testing 40");
		
		
		System.out.println(hm);

		System.out.println(hm.get(40));
		
		
		hm.remove(10);
		
		System.out.println(hm.containsKey(10));
		System.out.println(hm.containsValue("testing 20"));
		
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.keySet());

		System.out.println(hm.values());
		
		System.out.println(hm.entrySet());
	}

}
