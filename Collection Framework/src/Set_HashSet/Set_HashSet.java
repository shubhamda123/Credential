package Set_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {

	public static void main(String[] args) {
		
		Set h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		h.add(12.5f);
		h.add("abc");
		
		h.add(null);// null insertion possible only once
		h.add(null);// repeat null not allowed
		System.out.println(h.add(10));//false-- dupliacte value 10 arenot allowed so return false
		System.err.println(h.add(100));//true
		System.out.println(h);// [null,20,10,30]--insertion order isnot maintained
		                // |
		               //  Heterogenius value are allowed like int, float,double,String

	}

}
