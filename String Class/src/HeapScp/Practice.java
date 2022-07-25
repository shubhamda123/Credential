package HeapScp;

public class Practice {

	public static void main(String[] args) {
		//         01234567
		String s1="java abc";
		String s2="java abc";
		String s3="pqrst";
		String s11="JavA Abc";
		//                    01234567890123456789012
		String s4=new String("java abc by kunal sirku");
		String s5=new String("java by kunal sir");
		String s6=new String("java abc");
		String s7=new String("abcdef");
	
//		System.out.println(s1.equals(s2));
//     	System.out.println(s1.equals(s3));
//		System.out.println(s1.equals(s6));//true
//		System.out.println(s1.equals(s4));//false
//		System.out.println(s1==s2);//true
//		System.out.println(s1==s6);//false
//
//		System.out.println(s1.equalsIgnoreCase(s11));//true
//		System.out.println(s1.equalsIgnoreCase(s6));//true

//		System.out.println(s1.charAt(6));
//		System.out.println(s4.charAt(8));
		
	//	System.out.println(s1.length());
		
//		System.out.println(s1.indexOf('v'));
//		System.out.println(s1.indexOf("ab"));//5
//		System.out.println(s4.indexOf('a', 5));//11
//		System.out.println(s4.indexOf("ku", 10));
//		
//		System.out.println(s1.lastIndexOf('a'));//5
//		System.out.println(s4.lastIndexOf('a', 13));//11
		
//		System.out.println(s1.concat(s4));
//		System.out.println(s1.concat("by kunal sir"));
		
		System.out.println(s4.contains(s1));
		
//		System.out.println(s1.replace('a', 'b'));
//		System.out.println(s1.replace(s1, "java by kuunal sir"));
//		System.out.println(s4.replaceAll("java abc", "java by kiran sir"));
		
	/*
	 * System.out.println(s4.substring(7)); 
	 * System.out.println(s4.substring(3, 7));
	 * String m=" "; System.out.println(s1.isEmpty());
	 * System.out.println(m.isEmpty());// space also count index so it false
	 */
		
	/*
	 * String m1="   IPL 2022 End soon  "; System.out.println(m1);
	 * System.out.println(m1.trim()); //end String space of both sides Start and end
	 * but not middle space of String
	 */		
		
	/*
	 * String m2="SHUbhaM DANDekar"; 
	 * System.out.println(m2.toLowerCase());
	 * System.out.println(m2.toUpperCase());
	 */
	    
	/*
	 * int value=30; String m3=String.valueOf(value);
	 *  System.out.println(m3+10);//Concentrating string with 10
	 */
		String m4="java by kunal sir";
		String m5[]=m4.split("\\s");
		for(String w:m5)
		{
			System.out.println(w);
		}
	
	}

}