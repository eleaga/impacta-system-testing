package pages;

import support.DriverQA;

public class Read extends BasePage{

    public Read(DriverQA stepDriver) {
        super(stepDriver);
    }

    public String getResult(){
        return driver.getText("result");
    }
}
