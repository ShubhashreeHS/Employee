import java.sql.*;
import java.util.Scanner;  
class mysql
{  
public static void main(String args[])
{  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/company","root","");  
Statement stmt=con.createStatement(); 

Scanner k = new Scanner(System.in); 
System.out.println("enter SSN"); 
int SSN = k.nextInt(); 
System.out.println("enter Name"); 
String Name = k.next(); 
System.out.println("enter Adress"); 
String Adress = k.next(); 
System.out.println("enter Sex"); 
String Sex = k.next(); 
System.out.println("enter Salary"); 
int Salary= k.nextInt(); 
System.out.println("enter SuperSSN"); 
int SuperSSN= k.nextInt(); 
System.out.println("enter Dno"); 
int Dno= k.nextInt(); 


//Inserting data using SQL query 
String sql = "insert into emp values("+SSN+",'"+Name+"','"+Adress+"','"+Sex+"',"+Salary+","+SuperSSN+","+Dno+")"; 

try
{ 
	
	//Reference to connection interface 
	Statement st = con.createStatement(); 
	int m = st.executeUpdate(sql); 
	if (m == 1) 
		System.out.println("inserted successfully : "+sql); 
	else
		System.out.println("insertion failed"); 
} 
catch(Exception ex) 
{ 
	System.err.println(ex); 
}

ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getInt(5)+"  "+rs.getInt(6)+"  "+rs.getInt(7));  
con.close();  
}
catch(Exception e)
{ 
	System.out.println(e);}  
}  
}  

