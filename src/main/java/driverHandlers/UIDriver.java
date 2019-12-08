package driverHandlers;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UIDriver {

  static WebDriver driver;

  public UIDriver(){
    if(driver==null)
      initiateDriver();
  }

  public void initiateDriver(){
//    System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");
//    driver = new ChromeDriver();

    DesiredCapabilities desiredCapabilities = SetCapabilities();
    try {
      driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
    } catch (MalformedURLException e) {
      System.out.println("URL is not formed correctly");
    }

    driver.get("https://phptravels.com");
  }

  private DesiredCapabilities SetCapabilities() {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
   // desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
//    desiredCapabilities.setCapability("name", "FAN-testExecution:" + System.getProperty("executionTag"));
//    desiredCapabilities.setCapability("build", "Build:" + System.getProperty("microserviceBuild"));
    desiredCapabilities.setCapability("idleTimeout", 240);
    desiredCapabilities.setCapability("tz", "Asia/Kolkata");
    return desiredCapabilities;

  }

  public WebDriver getDriver(){
    return driver;
  }



}
