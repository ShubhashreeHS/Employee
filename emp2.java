
import java.sql.*;
import java.util.Scanner;  
class emp2
{  
public static void main(String args[])
{  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/company","root","");  
Statement stmt=con.createStatement(); 
System.out.println("Name of employee who are belong to Dno 4:");
System.out.println();
ResultSet rs=stmt.executeQuery("select * from emp where Dno=4");  
while(rs.next())  
	System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5)+"  "+rs.getInt(6)+"  "+rs.getInt(7));
System.out.println();
System.out.println("Name of employee whose SuperSSN:");
System.out.println();
ResultSet rs1=stmt.executeQuery("select * from emp where SuperSSN=1");  
while(rs1.next())  
	System.out.println(rs1.getString(1)+"  "+rs1.getString(2)+"  "+rs1.getString(3)+"  "+rs1.getString(4)+"  "+rs1.getInt(5)+"  "+rs1.getInt(6)+"  "+rs1.getInt(7)); 
con.close(); 
}
catch(Exception e)
{ 
	System.out.println(e);}  
} 

}

