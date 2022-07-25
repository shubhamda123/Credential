package settergetterthrough;

public class Data {
	
	public Doctor firstDoctor()
	{
		 Doctor d=new Doctor();
		 d.setDid(12);
		 d.setDname("Dr. Kashyap");
		 d.setHospitalname("Kalambe hospital");
		 d.setFees(200);
		 d.setAadr("Shashtri chowk");
		 
		 return d;
	}
	public Doctor secondDoctor()
	{
		 Doctor d=new Doctor();
		 d.setDid(456);
		 d.setDname("Kalambe");
		 d.setHospitalname("satpute hospital");
		 d.setFees(400);
		 d.setAadr("arvi naka");
		 return d;
	}

}
