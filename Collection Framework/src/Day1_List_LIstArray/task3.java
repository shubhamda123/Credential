package Day1_List_LIstArray;

import java.util.ArrayList;
import java.util.List;

public class task3 {

	public static void main(String[] args) {
		
		//33.3, 22.39d, 19.03, 97.23D, 78.1, 16d
	//      0     1       2       3      4    5
		List al=new ArrayList();
		
		al.add(33.3);
		al.add(22.39d);
		al.add(19.03);
		al.add(97.23d);
		al.add(78.1);
		al.add(16d);
		
		double d=(double)al.get(0);
		System.out.println(d);
		
		double d1=(double)al.get(1);
		System.out.println(d1);
		
		double d2=(double)al.get(2);
		System.out.println(d2);
		
		double d3=(double)al.get(3);
		System.out.println(d3);
		
		double d4=(double)al.get(4);
		System.out.println(d4);
		
		double d5=(double)al.get(5);
		System.out.println(d5);
		
 
	}

}
