package pages;

import support.DriverQA;

public class Update extends BasePage{

    public Update(DriverQA stepDriver) {
        super(stepDriver);
    }

    public String getResult(){
        return driver.getText("result");
    }


    public void updateClick() {
        String selector = ".ls-table tr:first-child a.ls-btn:nth-child(1)";
        driver.click(selector, "css");
    }

    public void fillUpdateForm() {
        driver.sendKeys("Teste Luiz", "processo_vara", "id");
    }

    public void updateButton() {
        driver.click("btn-save", "id");
    }

    public void updateSuccess() {
        driver.getText(".ls-alert-success", "css");
    }
}
