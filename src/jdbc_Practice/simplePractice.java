package jdbc_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class simplePractice {
		
		public static void main(String[] args) throws Exception {
			String userName = "hr";
			String password = "hr";
			//url : jdbc:DataBaseType:thin@Host:port:SID
			String url = "jdbc:oracle:thin:@3.95.5.75:1521:xe";
			Connection connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connect Successfully");
		}
	}



