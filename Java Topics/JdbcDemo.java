import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
        //getAllDetails();
		// getReadDemo(9);
//		getInsertDemo();
//		getUpdateDemo(); 
		getDeleteDemo();
	}

	private static void getAllDetails() throws SQLException {
		String url="jdbc:mysql://localhost:3306/db_learning";
		String userName = "root";
		String password = "Anand0308@";
		
		 Connection con = DriverManager.getConnection(url,userName,password);//step 1
		 Statement st=con.createStatement();//step 2
		 ResultSet rs = st.executeQuery("select * from student");//step 3 , 4
		
		 while( rs.next()) {
		 System.out.println(rs.getInt(1));
		 System.out.println(rs.getString(2));
		 System.out.println(rs.getString(3));
		 System.out.println("------------------------------");
		 }
		 con.close();//step 5
	}
	
	private static void getReadDemo(int no) throws SQLException {
		String url="jdbc:mysql://localhost:3306/db_learning";
		String userName = "root";
		String password = "Anand0308@";
		
		 Connection con = DriverManager.getConnection(url,userName,password);//step 1
		 Statement st=con.createStatement();//step 2
		 ResultSet rs = st.executeQuery("select * from student where id="+ no);//step 3 , 4
		
		 while( rs.next()) {
		 System.out.println(rs.getInt(1));
		 System.out.println(rs.getString(2));
		 System.out.println(rs.getString(3));
		 System.out.println("------------------------------");
		 }
		 con.close();//step 5
	}
	private static void getInsertDemo() throws SQLException {

		String url="jdbc:mysql://localhost:3306/db_learning";
		String userName = "root";
		String password = "Anand0308@";
		
		 Connection con = DriverManager.getConnection(url,userName,password);//step 1
		 Statement st=con.createStatement();//step 2
		 String query = "insert into student (id,name , location) values(10,'Dhasaradhan','Thiruchi')";
		 int rows = st.executeUpdate(query);
		
		
		 System.out.println(rows+" Records has been added succesfully");
		 
		 con.close();//step 5
	}
	private static void getUpdateDemo() throws SQLException {
		String url="jdbc:mysql://localhost:3306/db_learning";
		String userName = "root";
		String password = "Anand0308@";
		
		 Connection con = DriverManager.getConnection(url,userName,password);//step 1
		 Statement st=con.createStatement();//step 2
		 String query = "update student set location = 'Goa' where id = 1";
		 int rows = st.executeUpdate(query);
		
		
		 System.out.println(rows+" Records has been Updated succesfully");
		 
		 con.close();//step 5
	}
	private static void getDeleteDemo() throws SQLException {
		String url="jdbc:mysql://localhost:3306/db_learning";
		String userName = "root";
		String password = "Anand0308@";
		
		 Connection con = DriverManager.getConnection(url,userName,password);//step 1
		 Statement st=con.createStatement();//step 2
		 String query = "delete from  student where id = 5";
		 int rows = st.executeUpdate(query);
		
		
		 System.out.println(rows+" Records has been Delete succesfully");
		 
		 con.close();//step 5
	}
	
	

}



