package pages;

import support.DriverQA;

public class Read extends BasePage{

    public Read(DriverQA stepDriver) {
        super(stepDriver);
    }

    public String getResult(){
        return driver.getText("result");
    }

    public void openPage() {
        String url = "http://agapito-server.herokuapp.com/processos";
        driver.openURL(url);
    }

    public void show() {
        driver.click("/html/body/main/div/table/tbody/tr[1]/td[9]/a");
    }
}
