package selectionMenuTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ApplicationLog;
import reporting.TestLogger;
import selectionMenu.RadioButton;

public class RadioButtonTest extends CommonAPI {

    @Test
    public void selectionRadioButtonTest(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        RadioButton radioButton = PageFactory.initElements(driver,RadioButton.class);
        radioButton.selection();
    }

}
