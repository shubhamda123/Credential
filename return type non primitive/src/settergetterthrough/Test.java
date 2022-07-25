package settergetterthrough;

public class Test {
   public static void main(String[] args) {
	
	  Data d=new Data();
	 Doctor p=  d.firstDoctor();
	 Doctor q= d.secondDoctor();
	 
	 System.out.println("first doctor id ="+p.getDid());
	 System.out.println("name="+p.getDname());
	 System.out.println("Hospital name="+p.getHospitalname());
	 System.out.println("fees="+p.getFees());
	 System.out.println("address="+p.getAadr());
	  
	 System.out.println("second dr.= "+q.getDid()+","+q.getDname()+","+q.getHospitalname()+","+q.getFees()+","+q.getAadr());
	  
}
}
