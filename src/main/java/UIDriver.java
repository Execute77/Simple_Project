import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIDriver {

  static WebDriver driver;

  UIDriver(){
    if(driver==null)
      initiateDriver();
  }

  public void initiateDriver(){
    System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
    driver = new ChromeDriver();
  }

  public WebDriver getDriver(){
    return driver;
  }



}
