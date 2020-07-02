package jdbc_Practice;

import java.sql.ResultSet;
import java.sql.SQLException;

import Utility.DBUtility;

public class ResultSet_DataStructure {
	 
    public static void main(String[] args) throws SQLException {
        
        ResultSet result = DBUtility.getResult("Select * from Employees");
        
        while(result.next()) {
            String firstName = result.getString("first_name");
            String lastName = result.getString("last_name");
            
            String fullName = firstName+" "+lastName;
            System.out.println(fullName);
            
        }
    }
}
