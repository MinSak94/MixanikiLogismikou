import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class SqlStatementsTest {
	SqlStatements sqls = new SqlStatements();
	
			@Test
	public void testLoginAction() throws SQLException, Exception {
		assertEquals("Result",true,sqls.LoginAction("t", "t", "HRM"));
		assertEquals("Result",false,sqls.LoginAction("", "t", "HRM"));
		assertEquals("Result",false,sqls.LoginAction("t", "", "HRM"));
		assertEquals("Result",false,sqls.LoginAction("", "", "HRM"));
		assertEquals("Result",false,sqls.LoginAction("m", "m", "HRM"));
	}


	@Test
	public void testAfterLoginFormDeleteAction() throws SQLException, Exception {
		assertEquals("Result",true,sqls. AfterLoginFormDeleteAction("Dep2"));
		assertEquals("Result",false,sqls. AfterLoginFormDeleteAction("lathos"));
	}

	@Test
	public void testAfterLoginFormDelete1Action() throws SQLException, Exception {
		assertEquals("Result",true,sqls.AfterLoginFormDelete1Action("v","v"));
	}
	@Test
	public void testAfterLoginFormDelete2Action() throws SQLException, Exception {
		assertEquals("Result",1,sqls.AfterLoginFormDelete2Action("2017"));
		assertEquals("Result",0,sqls.AfterLoginFormDelete2Action("lathos"));
	}


		@Test
	public void testDepartmentEditCreate() throws SQLException, Exception {
		assertEquals("Result",true,sqls.DepartmentEditCreate("Dep12").next());
		assertEquals("Result",false,sqls.DepartmentEditCreate("lathos").next());
	}	

		@Test
	public void testDepartmentEditAction() throws SQLException, Exception {
		assertEquals("Result",true,sqls.DepartmentEditAction("m","m","r","r","r","r","Dep1"));
		assertEquals("Result",false,sqls.DepartmentEditAction("m","l","r","r","r","r","dep1"));
		assertEquals("Result",false,sqls.DepartmentEditAction("m","l","r","r","r","r","dep0"));
	}

		@Test
	public void testDepartmentCreate() throws SQLException, Exception {
			assertEquals("Result",true,sqls.DepartmentCreate("we","lrt","rt","rt","r"));
			assertEquals("Result",false,sqls.DepartmentCreate("re","lrt","rt","rt","r"));
	}

	@Test
	public void testEmployeeEditView1() throws SQLException, Exception {
		assertEquals("Result",true,sqls.EmployeeEditView1("p","p").next());
		assertEquals("Result",false,sqls.EmployeeEditView1("k","k").next());
		assertEquals("Result",true,sqls.EmployeeEditView1("h","h").next());
	}

	@Test
	public void testEmployeeEditView2() throws SQLException, Exception {
		assertEquals("Result",true,sqls.EmployeeEditView2("1212").next());
		assertEquals("Result",false,sqls.EmployeeEditView2("12").next());
	}

	@Test
	public void testEmployeeCreateAction() throws SQLException, Exception {
		assertEquals("Result",true,sqls.EmployeeCreateAction("1111","a","a" ,"a" ,"a" , "a","24" ,"a" , "23","2" ));
	}

	@Test
	public void testEmployeeEditAction() throws SQLException, Exception {
		assertEquals("Result",true,sqls.EmployeeEditAction("9","a","a" ,"a" ,"a" , "a","24" ,"a" , "23","2","8" ));
		assertEquals("Result",false,sqls.EmployeeEditAction("1821","a","a" ,"a" ,"a" , "a","24" ,"a" , "23","2","2" ));
	}
	

	@Test
	public void testManagerAction() throws SQLException, Exception {
		assertEquals("Result",true,sqls.ManagerAction("test","junit","0" ,"none" ,"none" , "0","J" ,"UNIT"));
	}
	

		@Test
	public void testRegistration() throws SQLException, Exception {
			assertEquals("Result",true,sqls.Registration("test","test"));
			assertEquals("Result",false,sqls.Registration("D","D"));
	}

		@Test
	public void testSearchEmployee() throws SQLException, Exception {
			assertEquals("Result",true,sqls.SearchEmployee("1994","a","a" ,"a" ,"a" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","a","a" ,"a" ,"a" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","a" ,"a" ,"a" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","a","" ,"a" ,"a" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","a","a" ,"" ,"a" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","a","a" ,"a" ,"" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","a","a" ,"a" ,"a" , "","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","a","a" ,"a" ,"a" , "a","" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","a","a" ,"a" ,"a" , "a","24" ,"" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","a","a" ,"a" ,"a" , "a","24" ,"a" , "","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","a","a" ,"a" ,"a" , "a","24" ,"a" , "23","").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","" ,"a" ,"a" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","a" ,"" ,"a" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","a" ,"a" ,"" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","a" ,"a" ,"a" , "","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","a" ,"a" ,"a" , "a","" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","a" ,"a" ,"a" , "a","24" ,"" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","a" ,"a" ,"a" , "a","24" ,"a" , "","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","a" ,"a" ,"a" , "a","24" ,"a" , "23","").next());//
			
			assertEquals("Result",true,sqls.SearchEmployee("1994","","" ,"" ,"a" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","" ,"a" ,"" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","" ,"a" ,"a" , "","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","" ,"a" ,"a" , "a","" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","" ,"a" ,"a" , "a","24" ,"" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","" ,"a" ,"a" , "a","24" ,"a" , "","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("1994","","" ,"a" ,"a" , "a","24" ,"a" , "23","").next());
			
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"a" ,"a" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"a" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"a" ,"" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"a" ,"a" , "","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"a" ,"a" , "a","" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"a" ,"a" , "a","24" ,"" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"a" ,"a" , "a","24" ,"a" , "","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"a" ,"a" , "a","24" ,"a" , "23","").next());

			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "a","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"a" , "","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"a" , "a","" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"a" , "a","24" ,"" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"a" , "a","24" ,"a" , "","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"a" , "a","24" ,"a" , "23","").next());

			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "a","" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "a","24" ,"" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "a","24" ,"a" , "","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "a","24" ,"a" , "23","").next());

			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","24" ,"" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","24" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","24" ,"a" , "","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","24" ,"a" , "23","").next());
			
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","" ,"" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","" ,"a" , "","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","" ,"a" , "23","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","" ,"a" , "23","").next());

			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","" ,"" , "","12").next());
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","" ,"" , "23","").next());
			
			assertEquals("Result",true,sqls.SearchEmployee("","","" ,"" ,"" , "","" ,"" , "","").next());


	}
		

		@Test
	public void testSignUpFormActions() throws SQLException, Exception {
			assertEquals("Result",true,sqls.SignUpFormActions("j","unit","junit@junit.j"));
	}
		

	@Test
	public void testValuationCreate() throws SQLException, Exception {
		assertEquals("Result",true,sqls.ValuationCreate().next());
	}

	@Test
	public void testValuationEdit() throws SQLException, Exception {
		assertEquals("Result",true,sqls.ValuationEdit("6").next());
		assertEquals("Result",false,sqls.ValuationEdit("2027").next());
		assertEquals("Result",false,sqls.ValuationEdit("26").next());
	}

	@Test
	public void testValuationCreateAction() throws SQLException, Exception {
		assertEquals("Result",true,sqls.ValuationCreateAction("24",4,4,4,4,4,4,4,"CR"));
		assertEquals("Result",true,sqls.ValuationCreateAction("24",4,4,4,4,4,4,4,"ED"));
		assertEquals("Result",false,sqls.ValuationCreateAction("22",4,4,4,4,4,4,4,"ED"));


	}

}
