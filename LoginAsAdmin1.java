import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        new AdminPanel().clickAllLinksInMenuAndCheckIsHeaderPresent();
    }

    @After
    public void teardown(){
        DriverFactory.getDriver().quit();
    }
}
