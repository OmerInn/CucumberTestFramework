package stepDefinitions;

import pageObjectModel.ContactUsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.RegisterPage;
import utilities.Driver;

public class ContactUsSteps {

    private WebDriver driver;
    private ContactUsPage contactPage; // WebDriver ile ilişkilendirilmiş bir örnek oluşturuldu

    @Given("navigate to Website Contact Us")
    public void navigateToWebsiteContactUs() {
        driver = Driver.getDriver();
        contactPage = new ContactUsPage(driver);
        driver.manage().window().maximize();
        Driver.getDriver().get("http://www.automationpractice.pl/index.php");
    }
    @Given("click on contact us button")
    public void click_on_contact_us_button() {
        contactPage.clickContactUsButton();
    }

    @Given("select Subject Heading")
    public void select_subject_heading() {
        contactPage.selectFromDropDown();
    }

    @Given("type Email")
    public void type_email() {
        contactPage.sendEmail();
    }

    @Given("type Order reference")
    public void type_order_reference() {
        contactPage.sendOrderReference();
    }

    @Given("type a message")
    public void type_a_message() {
        contactPage.typeMessage();
    }

    @When("click on send button")
    public void click_on_send_button() {
        contactPage.clickOnSendButton();
    }

    @Then("verify success message")
    public void verify_success_message() {
        contactPage.assertMyMessage();
    }


}
