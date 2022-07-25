package Comparator;

import java.util.Comparator;

public class RollnoSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getRollno()-o2.getRollno();
	}
	
	

}
