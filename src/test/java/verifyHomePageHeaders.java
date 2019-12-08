import org.testng.Assert;
import org.testng.annotations.Test;

import page.HotelsModulePage;
import page.MenuBarItemsPage;

public class verifyHomePageHeaders extends  TestCase{

  MenuBarItemsPage menuPage;

  public verifyHomePageHeaders(){
     menuPage = new MenuBarItemsPage();
  }

  @Test
  public void verifyHeader() throws InterruptedException {
    String txt = menuPage.getTextForums();
    Assert.assertEquals(txt,"FORUMS");
  }
}
