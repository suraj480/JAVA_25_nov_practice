package DataAccessObjectPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAOImpl implements EmployeeDAO{
	static final String JDBC_DRIVER = "org.postgresql.Driver"; // jdbc name
	static final String DB_URL = "jdbc:postgresql://localhost/MAURYA"; // jdbc url
// database credentials
	static final String USER = "postgres";
	static final String PASS = "postgres";
	boolean insertStaus=false;
	boolean getInfo=false;
	boolean	listStatus=false;
	@Override
	public boolean addEmployee(Employee emp) {
		try {
			//Request for connection
			Connection conn = DriverManager.getConnection(DB_URL,USER, PASS);
		   //Submit sql commands to the db server
	String QUERY ="INSERT INTO employees VALUES (?,?,?,?)";
	PreparedStatement pst=conn.prepareStatement(QUERY);//prepare compile
	pst.setInt(1,emp.getEmpno());
	pst.setString(2,emp.getEmpname());
	pst.setInt(3,emp.getAge());
	pst.setDouble(4,emp.getSalary());
	int result =pst.executeUpdate();
	if(result==1) {
		System.out.println("1 row inserted");
		insertStaus=true;
	}else {
		insertStaus=false;
		System.out.println("0 row inserted");
		
	}
//			stmt.close();
			conn.close();
    	}catch(SQLException e) {
    		System.err.println(e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
    	}
		return insertStaus;	
	}

	@Override
	public boolean addEmployee(int empno, String empname, int age, double salary) {
		try {
			//Request for connection
			Connection conn = DriverManager.getConnection(DB_URL,USER, PASS);
		   //Submit sql commands to the db server
	String QUERY ="INSERT INTO employees VALUES (?,?,?,?)";
	PreparedStatement pst=conn.prepareStatement(QUERY);//prepare compile
	pst.setInt(1,empno);
	pst.setString(2,empname);
	pst.setInt(3,age);
	pst.setDouble(4,salary);
	int result =pst.executeUpdate();
	if(result==1) {
		System.out.println("1 row inserted");
		insertStaus=true;
	}else {
		insertStaus=false;
		System.out.println("0 row inserted");
		
	}
//			stmt.close();
			conn.close();
    	}catch(SQLException e) {
    		System.err.println(e.getClass().getName() + " : " + e.getMessage());
			System.exit(0);
    	}
		return insertStaus;	

	}

	@Override
	public boolean updateEmployee(int empno, String empname, int age, double salary) {
		boolean updateStatus=false;
		 try {
		        // Establish a connection
		        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		        // Prepare the SQL update statement
		        String sql = "UPDATE employees SET employee_name = ?, age = ?, salary = ? WHERE employee_id = ?";
		        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
		            // Set the parameters in the update statement
		            preparedStatement.setString(1, empname);
		            preparedStatement.setInt(2, age);
		            preparedStatement.setDouble(3, salary);
		            preparedStatement.setInt(4, empno);	

		            // Execute the update
		            int rowsUpdated = preparedStatement.executeUpdate();

		            // Check if the update was successful
		            if (rowsUpdated > 0) {
		                updateStatus = true;
		                System.out.println("Employee information updated successfully.");
		            } else {
		                updateStatus = false;
		                System.out.println("No employee found with the specified ID.");
		            }
		        }

		        // Close the connection
		        conn.close();
		    } catch (SQLException e) {
		        System.err.println(e.getClass().getName() + " : " + e.getMessage());
		        e.printStackTrace();  // Print the full stack trace for debugging
		    }
		    
		    return updateStatus;
		}


	@Override
	public Employee getEmployee(int empno) {
	    Employee emp = null;
	    int employeeId = empno;
	    
	    try {
	        // Establish a connection
	        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

	        // Prepare the SQL query with a parameter
	        String sql = "SELECT * FROM employees WHERE employee_id = ?";
	        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
	            // Set the ID parameter in the query
	            preparedStatement.setInt(1, employeeId);

	            // Execute the query
	            ResultSet rs = preparedStatement.executeQuery();

	            // Process the result
	            while (rs.next()) {
	                emp = new Employee();
	                emp.setEmpno(rs.getInt(1));
	                emp.setEmpname(rs.getString(2));
	                // Additional processing if needed
	                System.out.println("Employee ID: " + rs.getInt(1));
	                System.out.println("Employee Name: " + rs.getString(2));
	                System.out.println("Employee Age: " + rs.getInt(3));
	                System.out.println("Employee Salary: " + rs.getDouble(4));
	            }
	        }

	        // Close the connection
	        conn.close();
	    } catch (SQLException e) {
	        System.err.println(e.getClass().getName() + " : " + e.getMessage());
	        e.printStackTrace();  // It's usually helpful to print the full stack trace for debugging
	    }   
	    return emp;
	}	
}
