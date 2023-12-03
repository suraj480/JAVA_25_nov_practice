package JunitPractice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
List<Employee> empList = new ArrayList<>();
public boolean addEmployee(Employee emp){
	return empList.add(emp);
}

public Employee getEmployee(int empno) {
	Employee emp=null;
	for(Employee e:empList) {
		if(e.getEmpNo()==empno)
		emp=e;
		break;
	}
	return emp;
	
}

}
