package selectionMenu;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.ApplicationLog;
import reporting.TestLogger;

import java.util.List;

public class RadioButton extends CommonAPI {

    @FindBy(xpath = "//div[@id='radio-btn-example']//label")
    List<WebElement> radioButton;

    public List<WebElement> getRadioButton() {
        return radioButton;
    }

    public void selection(){
        ApplicationLog.epicLogger();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(radioButton.size());
        for(int i = 0 ; i<=radioButton.size();i++){
            if(radioButton.get(i).getText().equalsIgnoreCase("Honda")) {
                radioButton.get(i).click();
            }
        }
    }
}
