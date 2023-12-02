package DataAccessObjectPattern;

public class DAOTest {
public static void main(String [] args) {
EmployeeDAO dao=new EmployeeDAOImpl();
// boolean result= dao.addEmployee(new Employee(108,"Ritul",27,70000.0));
//if(result) {
//	System.out.println("s");
//}else {
//System.out.println("N");
//}
// dao.getEmployee(108);
dao.updateEmployee(108,"bravo",10,10.0);
}
}
