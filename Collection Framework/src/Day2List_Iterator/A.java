package Day2List_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {

	public static void main(String[] args) {
	 
	List al=new ArrayList();
	
	al.add(5);
	al.add(10);
	al.add(20);
	al.add(30);
	System.out.println(al);//[5,10,20,30]

//	int a=(int)al.get(1);
	
	   Iterator itr=al.iterator();
	   
	   while(itr.hasNext())
	   {
		   int x=(int)itr.next();
		   System.out.println(x);
	   }
			   
	}

}
