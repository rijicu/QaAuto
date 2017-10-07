import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToAdminPage {

    @FindBy(name = "username")
    WebElement usernameControl;
    @FindBy(name = "password")
    WebElement userpasswordControl;
    @FindBy(xpath = "//button[@name='login']")
    WebElement submitButton;
    @FindBy(xpath = "//img[@class='center-block img-responsive']")
    WebElement mainLogo;
    public LoginToAdminPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public void loginAsUser(String userName, String userPass){
        usernameControl.sendKeys(userName);
        userpasswordControl.sendKeys(userPass);
        submitButton.click();
    }
}
