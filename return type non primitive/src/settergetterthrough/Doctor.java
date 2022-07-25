package settergetterthrough;

public class Doctor {
	 private int did;
	 private String dname;
	 private String hospitalname;
	 private int fees;
     private String aadr;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getHospitalname() {
		return hospitalname;
	}
	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getAadr() {
		return aadr;
	}
	public void setAadr(String aadr) {
		this.aadr = aadr;
	}
     
}
