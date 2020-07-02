package jdbc_Practice;

import java.sql.SQLException;

import Utility.DBUtility;

public class MetaData {

	public static void main(String[] args) throws SQLException{
		
		System.out.println(DBUtility.metaData.getUserName());
	}
}
