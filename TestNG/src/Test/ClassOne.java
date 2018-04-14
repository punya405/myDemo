package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {
  @BeforeTest
  public void f1() 
  {
	  System.out.println("In Class One Function One");
  }
  @Test
  public void f2() 
  {
	  System.out.println("In Class One Function Two");
  }
  @Test 
  public void f3() 
  {
	  System.out.println("In Class One Function Three");
  }
  @AfterTest
  public void f4() 
  {
	  System.out.println("In Class One Function Four");
  }
}
