package HeapScp;

public class task6 {

	public static void main(String[] args) {

		String s1="cjc";
		String s2="cjc";

		String s3=s1.toUpperCase();//CJC
		String s4=s1.toLowerCase();//cjc
		System.out.println(s1==s2);//true
		
		System.out.println(s1==s3);//false
		System.out.println(s2==s3);//false
		System.out.println(s2==s4);//true

		

	}

}
