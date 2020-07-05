package pages;

import support.DriverQA;

public class Create extends BasePage{

    public Create(DriverQA stepDriver) {
        super(stepDriver);
    }

    public String getResult(){
        return driver.getText("result");
    }

    public void openPage() {
        String url = "http://agapito-server.herokuapp.com/processos/new";
        driver.openURL(url);
    }

    public void fillForm(){
        driver.sendKeys("SP","processo_vara", "id");
        driver.sendKeys("123123","processo_numero_processo", "id");
        driver.sendKeys("Cívil","processo_natureza", "id");
        driver.sendKeys("Treste","processo_partes", "id");
        driver.sendKeys("01/01/2020","processo_data_entrada", "id");
        driver.sendKeys("aberto","processo_status", "id");
//
//        // radio
        driver.click("processo_arbitramento_s");
        // select
        driver.selectByText("Sim","processo_urgente", "id");

    }

    public void createdSuccess() {
        driver.getText(".ls-alert-success", "css");
    }

    public void save() {
        driver.click("btn-save");
    }

}
