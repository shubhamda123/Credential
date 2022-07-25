package HeapScp;

public class task2Contains {

	public static void main(String[] args) {
		
		String s="abc";
		String s1="abc karve abce";
		//         01234567890123
		String s3="abc";
		String s2="";
		System.out.println(s1.contains("abc"));
		System.out.println(s1.contains("mno"));
		System.out.println(s.contains("a"));
		System.out.println(s.length());
		
		System.out.println(s2.isEmpty());
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.indexOf("karve"));
		System.out.println(s1.indexOf('a', 6));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.lastIndexOf("ve"));
		System.out.println(s1.lastIndexOf('a',4));
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.equals(s2));
		System.out.println(s==s3);
		
		String s4[]=s1.split(" ");//      split method
		for(String w:s4)
		{
			System.out.println(w);
		}
		
		

	}

}
