package Generic;

import java.util.ArrayList;
import java.util.List;

public class Test_Student {

	public static void main(String[] args) {

		Student stu1=new Student();
		stu1.setRollno(123);
		stu1.setName("shubham");
		stu1.setMbno(965547665l);
		
		Student stu2=new Student();
		stu2.setRollno(456);
		stu2.setName("xyz");
		stu2.setMbno(696418462l);
		
		List<Student> al=new ArrayList<Student>();
		al.add(stu1);
		al.add(stu2);
		
		for(Student x:al)
		{
			System.out.println(x.getRollno());
			System.out.println(x.getName());
			System.out.println(x.getMbno());
		}

	}

}
