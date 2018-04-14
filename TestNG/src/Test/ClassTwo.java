package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo {
	@BeforeMethod
	  public void f1() 
	  {
		  System.out.println("In Class Two Function One");
	  }
	  @Test
	  public void f2() 
	  {
		  System.out.println("In Class Two Function Two");
	  }
	  @Test 
	  public void f3() 
	  {
		  System.out.println("In Class Two Function Three");
	  }
	  @AfterMethod
	  public void f4() 
	  {
		  System.out.println("In Class Two Function Four");
	  }
}
