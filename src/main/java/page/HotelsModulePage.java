package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import driverHandlers.DriverUtils;

public class HotelsModulePage {
  DriverUtils uidriver;
  public HotelsModulePage(){
     uidriver = new DriverUtils();
  }

  String header="(//h2)[1]";

  public String getHeaderText(){
    return uidriver.getText(header);
  }

}
