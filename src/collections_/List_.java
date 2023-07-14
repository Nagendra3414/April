package collections_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();

		list.add("Testing6");
		list.add("Testing");

		list.add("Testing1");

		list.add("Testing2");

		list.add("Testing3");
		list.add("Testing4");

		list.add("Testing5");

		list.add("Testing");

		list.add("Testing1");

		System.out.println(list);

		list.add(3, "New Testing");

		System.out.println(list);

		System.out.println(list.size());

		list.remove(3);

		list.remove(8);
		System.out.println(list);

		// System.out.println(list.get(0));

		list.set(0, "ABCD");

		for (int i = 0; i < list.size(); i++) {
			// System.out.println(list.get(i));

			
			if (list.contains("ABCD123")) {
				System.out.println("ABCD is available");
			}

		}

		System.out.println(list.isEmpty());

		
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		System.out.println(list2.isEmpty());

		list2.add("List2 123");
		
		list2.addAll(list);
		
		System.out.println(list2);
		
		list2.removeAll(list);
		
		System.out.println(list2);
		
		
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		
		list3.add(10);
		list3.add(20);

		list3.add(30);

		list3.add(40);
		
		System.out.println(list3);

		
		LinkedList<Integer> list4 = new LinkedList<Integer>();
		
		list4.add(100);
		list4.add(200);
		list4.add(300);
		list4.add(400);
		list4.add(500);
		
		System.out.println(list4);
		
		
	}
	
	
	

}
