package DataAccessObjectPattern;
public interface EmployeeDAO {
public boolean addEmployee(Employee emp);
public boolean addEmployee(int empno,String empname,int age, double salary);
public boolean updateEmployee(int empno, String empname, int age, double salary);
public Employee getEmployee(int empno);



}