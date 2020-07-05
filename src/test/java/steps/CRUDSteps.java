package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.Create;
import pages.Read;
import pages.Update;
import support.BaseSteps;

import java.util.List;

public class CRUDSteps extends BaseSteps {

    private static Create create = new Create(driver);

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


}
