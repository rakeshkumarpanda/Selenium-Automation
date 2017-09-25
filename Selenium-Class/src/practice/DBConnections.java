package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnections {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String loadDriver = "oracle.jdbc.driver.OracleDriver";
		String hostName = "epwfe2edb12c.test.intranet";
		String portNumber = "1605";
		String sid = "epwfe2e";
		String userName = "epwf_app";
		String password = "epwf_app_epwfe2e";
		
		Class.forName(loadDriver);
		System.out.println("Driver Loaded");
		
		
		
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@"+hostName+":"+portNumber+":"+sid,userName,password);
		System.out.println("Connection Established");
		
		Statement smt = con.createStatement();
		
		ResultSet rs = smt.executeQuery("select payment_status_cd from payment where payment_id = 406283");
		System.out.println("Executed the Query");
//		boolean next = rs.next();
//		System.out.println(next);
		
		while(rs.next())
		{
			System.out.println("Inside while loop");
			String payment_status = rs.getString("payment_status_cd");
			System.out.println(payment_status);
		}
		
		
		

	}

}
