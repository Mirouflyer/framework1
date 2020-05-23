package pageHomeTitleTest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;


public class PageTitleTest extends CommonAPI {
@Test
public void titlePageTest(){
    ApplicationLog.epicLogger();
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    String title = driver.getTitle();
    Assert.assertEquals(title,"Practice | Let's Kode It");
}

}
