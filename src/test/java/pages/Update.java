package pages;

import support.DriverQA;

public class Update extends BasePage{

    public Update(DriverQA stepDriver) {
        super(stepDriver);
    }

    public String getResult(){
        return driver.getText("result");
    }
}
