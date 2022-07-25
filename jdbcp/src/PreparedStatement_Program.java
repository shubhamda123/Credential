import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class PreparedStatement_Program {

	public static void main(String[] args) throws Exception {
	
      Class.forName("com.mysql.jdbc.Driver");
		
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	  
       String sql="insert into student values(?,?,?)";
  // String sql="delete from student where rollno=2";
      PreparedStatement ps=con.prepareStatement(sql);
	  System.out.println(sql);
	  ps.setInt(1, 2);
	  ps.setString(2, "Rahul dandekar");
	  ps.setString(3, "Pune");
	  
	  
	 
	  ps.execute();
	  con.close();
	  
	  
	 

	}

}
