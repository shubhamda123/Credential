package Day1_List_LIstArray;

import java.util.*;


public class A {

	public static void main(String[] args) {
		
    List al=new ArrayList();
     //                            ram-  0  1   2   3456789
    //                                   5 30  xyz
    al.add(5);
    al.add(30);
    al.add("xyz");
    System.out.println(al);
    
    int y=(int)al.get(0);
    System.out.println(y);
    
    int x=(int)al.get(1);
    
    System.out.println(x);
    
    String s=(String)al.get(2);
    System.out.println(s);
    
    
     
       
		

		
	}

}
