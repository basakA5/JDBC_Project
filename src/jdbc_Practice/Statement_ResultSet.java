package jdbc_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Statement_ResultSet {

		
		public static void main(String[] args) throws Exception {
			String userName = "hr";
			String password = "hr";
			
			//url : jdbc:DataBaseType:thin@Host:port:SID
			String url = "jdbc:oracle:thin:@3.95.5.75:1521:xe";
			
			//conncetion step:
			Connection connection = DriverManager.getConnection(url, userName, password);

			// Statement:
			Statement statement = connection.createStatement();
			System.out.println("Statement created");
			
			
			//REsultSet:
			ResultSet result = statement.executeQuery("select * from employees");
			
			System.out.println("ResultSet completed");
			
			
			

}
}