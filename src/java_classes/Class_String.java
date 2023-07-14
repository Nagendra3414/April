package java_classes;

public class Class_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "   Automation testing classes ";

		String s = new String("Testing");

		String con = a + " " + s;

		System.out.println(con);

		System.out.println(a.equals("automation"));

		System.out.println(a.equalsIgnoreCase("automation"));

		System.out.println(s.length());

		String b = a.trim();
		System.out.println(a);
		System.out.println(b);

		System.out.println(a.substring(10));

		System.out.println(a.substring(0, 4));

		System.out.println(b.indexOf("m"));

		String[] c = b.split(" ");

		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);

		String d = "abcd&efgh&ijkl&mnop";

		String[] words = d.split("&");

		for (int i = 0; i < words.length; i++) {

			if (words[i].equals("efghhfd")) {
				System.out.println(words[i]);
			}
		}

	}

}
