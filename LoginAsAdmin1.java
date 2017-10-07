import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginAsAdmin1 {

    private final String appLink = "http://localhost/admin/login.php";
    private final String adminName = "admin";
    private final String adminPass = "admin";

    @Before
    public void setUp(){
        DriverFactory.getDriver().get(appLink);
    }

    @Test
    public void loginAsAdmin1() {
       new LoginToAdminPage().loginAsUser(adminName,adminPass);
    }

    @Test
    public void checkThatAdminPanelDirectoriesContainHeaders(){
        new LoginToAdminPage().loginAsUser(adminName,adminPass);

        Assert.assertTrue(new AdminPanel().isHeaderPresent());

    }

    @After
    public void teardown(){
        DriverFactory.getDriver().quit();
    }
}
