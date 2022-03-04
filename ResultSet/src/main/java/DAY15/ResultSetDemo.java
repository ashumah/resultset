
		package DAY15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
		     
		public class ResultSetDemo{    
		 
		       public static void main(String[] args) throws ClassNotFoundException, SQLException {
		        // TODO Auto-generated method stub
		        String QUERY= " select * from employee_details";
		        Class.forName("com.mysql.cj.jdbc");  
		       try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ashu","root","ashu8055"))

		        {
		                Statement statemnt1 = con.createStatement();
		                ResultSetDemo rs1 =null;
		                rs1 = (ResultSetDemo) statemnt1.executeQuery(QUERY); 
		                ResultSetMetaData rsmd = (ResultSetMetaData) ((Connection) rs1).getMetaData();
		                System.out.println(" We are using ResultSetMetaData ");
		                System.out.println("No: of Columns: "+ rsmd.getColumnCount());
		                System.out.println("ColumnName of  Column 1: "+ rsmd.getColumnName(1));
		                System.out.println("Data Type of Column 2: " + rsmd.getColumnTypeName(2));
		                System.out.println("Table Name of the Column 1: " + rsmd.getTableName(1));
		                System.out.println("Schema Name of the Column 1: " + rsmd.getSchemaName(1));
		                 
		    }

	}



	}


