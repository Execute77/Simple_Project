package driverHandlers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtils {

  WebDriver driver;
  Actions actions;

  public DriverUtils(){
    UIDriver uiDriver = new UIDriver();
    driver = uiDriver.getDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();

  }

  public void click(String object){
    WebElement element = getElement(object);
    element.click();
  }

  public void hover(String object) throws InterruptedException {
    WebElement element = getElement(object);
    actions = new Actions(driver);
    actions.moveToElement(element).perform();
    Thread.sleep(5000);
  }

  private WebElement getElement(String object){
    return (new WebDriverWait(driver, 12)).until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath(object)));
  }

public void launchApp(String url){
    driver.get(url);
}

public String getText(String object){
    WebElement element = getElement(object);
    System.out.println("-----------"+ element.getText());
    return element.getText();
}

}
