package Generic_Iterator_foreachloop;

import java.util.List;

public class University_ForEachLoop {

	public static void main(String[] args) {
	
		College clg=new College();
		List<Student> l=clg.m1();
		
		for(Student s:l)
		{
			System.out.println(s.getRollno());
			System.out.println(s.getName());
		}

	}

}
