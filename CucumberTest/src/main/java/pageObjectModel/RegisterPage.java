package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.NoSuchElementException;

public class RegisterPage extends AbstractPage {



    @FindBy(css = "a.login")
    private WebElement signInButton;

    @FindBy(id = "email_create")
    private WebElement emailTextBox;

    @FindBy(id = "SubmitCreate")
    private WebElement submitButton;

    @FindBy(id = "id_gender1")
    private WebElement gender;

    @FindBy(id = "customer_firstname")
    private WebElement firstname;

    @FindBy(id = "customer_lastname")
    private WebElement lastname;

    @FindBy(name = "passwd")
    private WebElement password;

    @FindBy(id = "company")
    private WebElement company;

    @FindBy(name = "address1")
    private WebElement address;

    @FindBy(css = "#days")
    private WebElement days;

    @FindBy(css = "#months")
    private WebElement months;

    @FindBy(css = "#years")
    private WebElement years;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public void clickOnSignInButton() {
        clickFunction(signInButton);
    }

    public void typeEmail(String email) {
        sendKeysFunction(emailTextBox, email);
    }

    public void clickOnSubmitButton() {
        clickFunction(submitButton);
    }

    public void clickOnGender() {
        clickFunction(gender);
    }

    public void typeFirstnameAndLastName(String firstName, String lastName) {
        sendKeysFunction(firstname, firstName);
        sendKeysFunction(lastname, lastName);
    }

    public void typePassword(String password1) {
        sendKeysFunction(password, password1);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        try {
            selectElementDateOfBirth(days, day);
            selectElementDateOfBirth(months, month);
            selectElementDateOfBirth(years, year);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Doğum tarihi seçilirken hata oluştu: " + e.getMessage());
        }
    }

    public void clickOnRegisterButton() {
        clickFunction(registerButton);
    }
}
