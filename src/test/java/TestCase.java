import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import driverHandlers.UIDriver;

public class TestCase {

  @AfterSuite
  public void tearDown(){
    new UIDriver().getDriver().quit();
  }

//  @BeforeMethod
//  public void launch(){
//    new UIDriver().getDriver().get("https://phptravels.com/");
//  }
}
