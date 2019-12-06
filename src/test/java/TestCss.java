import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCss extends TestCase{

  @Test
  public void iTestCSS() throws InterruptedException {
    String url = "https://phptravels.com/demo/";
    DriverUtils uiDriver = new DriverUtils();
    uiDriver.launchApp(url);

    String object1 = "(//*[text()='Pricing'])[1]";
    uiDriver.click(object1);
    String txt  = uiDriver.getText(object1);

    Thread.sleep(4000);

    Assert.assertEquals("Pricing", txt);


  }
}
