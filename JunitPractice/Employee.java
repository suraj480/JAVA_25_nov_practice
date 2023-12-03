package JunitPractice;

public class Employee {
	int empNo;
	String empName;
	int age;
    double salary;
   public Employee(int empNo, String empName, int age, double salary, String designation) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
	}
String designation;
   @Override
public String toString() {
	return "Employee [empNo=" + empNo + ", empName=" + empName + ", age=" + age + ", salary=" + salary
			+ ", designation=" + designation + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((designation == null) ? 0 : designation.hashCode());
	result = prime * result + ((empName == null) ? 0 : empName.hashCode());
	result = prime * result + empNo;
	long temp;
	temp = Double.doubleToLongBits(salary);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (age != other.age)
		return false;
	if (designation == null) {
		if (other.designation != null)
			return false;
	} else if (!designation.equals(other.designation))
		return false;
	if (empName == null) {
		if (other.empName != null)
			return false;
	} else if (!empName.equals(other.empName))
		return false;
	if (empNo != other.empNo)
		return false;
	if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
		return false;
	return true;
}
public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Employee() {
	   
   }

}
