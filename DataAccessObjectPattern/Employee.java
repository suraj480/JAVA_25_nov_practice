package DataAccessObjectPattern;

public class Employee {
String empname;
double salary;
int age;
int empno;
public Employee() {
	
}
@Override
public String toString() {
	return "Employee [empname=" + empname + ", salary=" + salary + ", age=" + age + ", empno=" + empno + "]";
}
public Employee(int empno, String empname, int age, double salary) {
	super();
	this.empname = empname;
	this.salary = salary;
	this.age = age;
	this.empno = empno;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
}
