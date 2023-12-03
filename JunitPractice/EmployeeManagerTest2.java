package JunitPractice;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeManagerTest2 {
	@Before
public void initialize(){
	System.out.println("Initialize");
}
	@Test
public void test1() {
	System.out.println("Test1");
}
@Test
public void test2() {
	System.out.println("Test2");
}
@After
public void cleanUp() {
	System.out.println("Clean up");
}
}
