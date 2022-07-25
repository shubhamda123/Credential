package Day2List_Iterator;
import java.util.*;
public class task4CharIterator {

	public static void main(String[] args) {

		List al=new ArrayList();
		al.add('A');
		al.add('B');
		al.add('C');
		al.add('D');
		al.add('E');
		al.add('f');
		System.out.println("character"+al);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			char ch=(char)itr.next();
			System.out.println(ch);
		}
	}

}
