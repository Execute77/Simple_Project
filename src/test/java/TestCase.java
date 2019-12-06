import org.testng.annotations.AfterSuite;

public class TestCase {

  @AfterSuite
  public void tearDown(){
    new UIDriver().getDriver().quit();
  }
}
