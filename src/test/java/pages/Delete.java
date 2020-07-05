package pages;

import support.DriverQA;

public class Delete extends BasePage{

    public Delete(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void openPage() {
        String url = "http://agapito-server.herokuapp.com/processos";
        driver.openURL(url);
    }

    public void deleteFirst() {
        String selector = ".ls-table tr:first-child a.ls-btn-primary-danger";
        driver.getText(selector, "css");
    }


}
