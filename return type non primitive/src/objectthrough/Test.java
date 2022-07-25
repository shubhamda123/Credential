package objectthrough;

public class Test {

	public static void main(String[] args) {
	Data d=new Data();
	Employee w= d.details();
	
	System.out.println("Employee id= "+w.id);
	System.out.println("Employee name= "+w.name);
	System.out.println("Employee mobile no.= "+w.mb);
	System.out.println("Employee grade= "+w.ch);
	System.out.println("Employee status= "+w.status);
	}

}
