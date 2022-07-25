
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Statement_Program {
 
	public static void main(String[] args) throws Exception{
	
         Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		//String sql="create table student2 (rollno int(1),name varchar(20),address varchar(30))";
		String sql= "insert into student values(3,'amol sahare','nalwadi')";
  	  // String sql="update student set name='bbb'where rollno=2";
	   //String sql="delete from student where rollno=2";
		System.out.println(sql);
		Statement smt=con.createStatement();
		smt.execute(sql);
		smt.close();
		con.close();
		

	}

}
