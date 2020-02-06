import java.sql.*;
import java.util.Scanner;  
class emp1
{  
public static void main(String args[])
{  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/company","root","");  
Statement stmt=con.createStatement(); 
System.out.println("Name of employee whose name starts with S");
ResultSet rs=stmt.executeQuery("select Name from emp where Name like 'S%'");  
while(rs.next())  
	System.out.println(rs.getString(1));
System.out.println("Name of employee whose salary>=3000");
ResultSet rs1=stmt.executeQuery("select Name from emp where Salary>=30000");  
while(rs1.next())  
	System.out.println(rs1.getString(1)); 
con.close(); 
}
catch(Exception e)
{ 
	System.out.println(e);}  
} 

}
