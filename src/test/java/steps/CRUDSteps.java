package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.Create;
import pages.Read;
import pages.Update;
import pages.Delete;
import support.BaseSteps;

import java.util.List;

public class CRUDSteps extends BaseSteps {

    private static Create create = new Create(driver);
    private static Delete delete = new Delete(driver);
    private static Update update = new Update(driver);

    @Given("^open create page$")
    public void openCreatePage() throws Throwable {
        create.openPage();
    }

    @When("^fill form$")
    public void fillForm() throws Throwable {
        create.fillForm();
    }

    @When("^save new$")
    public void userInformsLoginWithValueEqual() throws Throwable {
        create.save();
    }

    @When("^created success$")
    public void createdSuccess() throws Throwable {
        create.createdSuccess();
    }

    @When("^open page$")
    public void openPage() throws Throwable {
        delete.openPage();
    }

    @When("^i should delete button$")
    public void deleteFirst() throws Throwable {
        delete.deleteFirst();
    }

    @When("^click update button$")
    public void updateClick() throws Throwable {
        update.updateClick();
    }

    @When("^update fill form")
    public void updateFillForm() throws Throwable {
        update.fillUpdateForm();
    }

    @When("^click on update form")
    public void updateButton() throws Throwable {
        update.updateButton();
    }

    @When("^I should see update success message")
    public void updateSuccess() throws Throwable {
        update.updateSuccess();
    }


}
