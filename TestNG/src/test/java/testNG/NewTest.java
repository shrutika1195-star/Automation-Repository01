package testNG;

import org.testng.annotations.Test;

public class NewTest  {
  @Test(priority=0)
  public void f() {
	  System.out.println("ManualTesting");
  }
  @Test
  public void f1() {
	  System.out.println("Automation Testing");
  }
  @Test(priority=1)
  public void f2() {
	  System.out.println("Testing");
  }
  @Test
  public void f3() {
	  System.out.println("Automation");
  }
}
