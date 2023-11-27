package stepDefinitions;

import pageObjectModel.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class RegisterSteps {
    private WebDriver driver;

    private RegisterPage registerPage; // WebDriver ile ilişkilendirilmiş bir örnek oluşturuldu

    @Given("Navigate to Website Register")
    public void navigateToWebsiteRegister() {
        driver = Driver.getDriver();
        registerPage = new RegisterPage(driver);
        Driver.getDriver().get("http://www.automationpractice.pl/index.php");
    }
    @And("click Sign in button")
    public void clickSignInButton() {
        registerPage.clickOnSignInButton();
    }
    @And("type email {string}")
    public void typeEmail(String email) {registerPage.typeEmail(email);
    }

    @And("click on Create an Account button")
    public void clickOnCreateAnAccountButton() {
    registerPage.clickOnSubmitButton();
    }

    @And("choose title")
    public void chooseTitle() {
        registerPage.clickOnGender();
    }

    @And("type firstname {string} and lastname {string}")
    public void typeFirstnameAndLastname(String firstname, String lastname) {
        registerPage.typeFirstnameAndLastName(firstname,lastname);
    }

    @And("type password {string}")
    public void typePassword(String password) {
        registerPage.typePassword(password);
    }

    @And("type dateOfBirth {string} {string} {string}")
    public void typeDateOfBirth(String Days, String Months, String Years) {
        registerPage.selectDateOfBirth(Days, Months, Years);
    }
    @And("click on register button")
    public void clickOnRegisterButton() {
        registerPage.clickOnRegisterButton();
    }
    @After
    public void quitDriver() throws InterruptedException {
        Thread.sleep(2000L);

        // WebDriver'ı kapatmak için Driver.quitDriver() kullanın
        Driver.quitDriver();
    }

}
