package collections_;

import java.util.LinkedHashSet;

public class LinkedHashSet_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> lhs = new LinkedHashSet();
		
		lhs.add("100");
		lhs.add("200");
		lhs.add("300");
		lhs.add("400");
		lhs.add("500");
		lhs.add("600");
		
		System.out.println(lhs);
		
		lhs.add("300");
		lhs.add("400");
		lhs.add("500");
		lhs.add("600");
		System.out.println(lhs);
		
	
		for(String obj: lhs)
		{
			System.out.println(obj);
		}
		
	}

}
