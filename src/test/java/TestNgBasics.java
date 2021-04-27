import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
    // pre-condition annationation --start with @before
	@BeforeSuite//1
	public void setUp() {

		System.out.println("setup system property for Chorm");
	}
	@BeforeTest//2
	public void launchBrowser() {
		System.out.println("launch chrom browser");
	}
	@BeforeClass//3
	public void login() {

		System.out.println("login to app");
	}
	@BeforeMethod
	//4
	public void enterUrl() {
		System.out.println("enter Url");
	}
    // test cases --start with @Test
	@Test(priority=2,groups="title")
	public void googleTitleTest() {
		System.out.println("google title test");
		//int i =9/0;
		
	}
	@Test(priority=1,groups="search",dependsOnMethods="googleTitleTest")
	public void searchTest() {
		System.out.println("search test");
	}
	// post-condition annationation --start with @after
	@AfterMethod
	//4
	public void ExitUrl() {
		System.out.println("Exit to Url");
	}
	@AfterClass  //3
	public void logout() {

		System.out.println("logout to app");
	}
	@AfterTest//2
	public void closeBrowser() {
		System.out.println("turn off the browser");
	}
	@AfterSuite//1
	public void genarateReport() {
		System.out.println("Report appeard");
	}
}
