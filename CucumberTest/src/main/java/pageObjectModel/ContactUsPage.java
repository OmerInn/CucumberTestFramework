package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends AbstractPage {


    @FindBy(xpath = "//a[.='Contact us']")
    private WebElement contactUsButton;

    @FindBy(id = "id_contact")
    private WebElement subjectHeadingDropDown;

    @FindBy(id = "email")
    private WebElement emailTextArea;

    @FindBy(id = "id_order")
    private WebElement orderReference;

    @FindBy(id = "message")
    private WebElement messageBox;

    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    @FindBy(css = "p.alert-success")
    private WebElement successMessage;

    public ContactUsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickContactUsButton() {
        clickFunction(contactUsButton);
    }

    public void selectFromDropDown() {
        selectElementFromDropdown(subjectHeadingDropDown, "Customer service");
    }

    public void sendEmail() {
        sendKeysFunction(emailTextArea, "cucumberautomation@gmail.com");
    }

    public void sendOrderReference() {
        sendKeysFunction(orderReference, "order123123");
    }

    public void typeMessage() {
        sendKeysFunction(messageBox, "Ürün farklı bir renk geldi , bazı yerlerinde kırıklar var.Lütfen email yolu ile bana dönüş sağlayın.Saygılarımla...");
    }

    public void clickOnSendButton() {
        clickFunction(sendButton);
    }

    public void assertMyMessage() {
        assertion(successMessage, "Your message has been successfully sent to our team.");
    }
}
