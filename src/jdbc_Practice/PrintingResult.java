package jdbc_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrintingResult {
	
	public static void main(String[] args) throws Exception {
		String userName = "hr";
		String password = "hr";
		String url = "jdbc:oracle:thin:@3.95.5.75:1521:xe";
		
		Connection connection = DriverManager.getConnection(url, userName, password);

		Statement statement = connection.createStatement();
		
		ResultSet result = statement.executeQuery("select * from employees");
		
		while (result.next()){
			//String firstname =result.getString("first_name"); bu butun isimleri getirir
			
			String firstname = result.getString(2);
			String lastname = result.getString(3);
			int salary = result.getInt("salary");
			
			System.out.println(firstname + " " + lastname + " $" + salary);
		}
		
	}
}
