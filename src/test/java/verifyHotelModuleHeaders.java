import org.testng.Assert;
import org.testng.annotations.Test;

import page.HotelsModulePage;
import page.MenuBarItemsPage;

public class verifyHotelModuleHeaders extends  TestCase{

  MenuBarItemsPage menuPage;
  HotelsModulePage hotelsModulePage;

  public verifyHotelModuleHeaders(){
     menuPage = new MenuBarItemsPage();
    hotelsModulePage = new HotelsModulePage();
  }

  @Test
  public void verifyHeader() throws InterruptedException {
    menuPage.navigateToHotelModule();
    String header = hotelsModulePage.getHeaderText();
    Assert.assertEquals(header,"HOTELS MODULE FEATURES");
  }
}
