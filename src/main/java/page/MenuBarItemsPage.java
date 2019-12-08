package page;

import java.sql.SQLOutput;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import driverHandlers.DriverUtils;

public class MenuBarItemsPage {

  DriverUtils uiDriver;

  public MenuBarItemsPage() {
     uiDriver = new DriverUtils();
  }

  String pricing = "(//a[text()='Pricing'])[1]";

  String Features = "(//button[contains(text(),'Features')])[1]";

  String mainFeature="//a[contains(text(), 'Main Features ')]";

  String webAppFeatures="(//button[contains(text(),'Web App Features')])[1]";

  String dekstopAppFeatures="((//button[contains(text(),'Dekstop App Features')])[1]/text())[1]";

  String hotelsModule="(//a[contains(text(), 'Hotels Module')])[1]";

  String forums="(//a[text()='Forums'])[1]";


  public void navigateToPricing(){
    uiDriver.click(pricing);
  }

  public void navigateToMainFeature() throws InterruptedException {
    uiDriver.click(Features);
    uiDriver.click(mainFeature);
  }

  public void navigateToHotelModule() throws InterruptedException {

    uiDriver.hover(Features);
    uiDriver.hover(webAppFeatures);
    uiDriver.click(hotelsModule);
  }

  public String getTextForums(){
    return uiDriver.getText(forums);
  }
}
