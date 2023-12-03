package JunitPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//Junit test for employee manager
public class EmployeeManagerTest {

	//Unit test case
	@Test
	public void testAddEmployee() {
		EmployeeManager em=new EmployeeManager();
		boolean expectedValue =true;
		boolean actualValue=em.addEmployee(new Employee(101,"sam",20,10.0,"SE"));
     assertEquals(expectedValue,actualValue);	
	}
	public void getEmployee() {
		EmployeeManager em=new EmployeeManager();
		em.addEmployee(new Employee(101,"sam",10,10.0,"SE"));
		em.addEmployee(new Employee(101,"sam",20,10.0,"CEO"));
		em.addEmployee(new Employee(101,"sam",32,10.0,"Db engineer"));
		em.addEmployee(new Employee(101,"sam",25,10.0,"Tester"));
		Employee actualEmp=em.getEmployee(101);
		
	}
	
}
