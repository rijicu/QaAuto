import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginAsAdmin {

    @Test
    public void loginAsAdmin() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost/admin/login.php");
        WebElement loginFild = driver.findElement(By.xpath("//input[@name='username']"));
        loginFild.sendKeys("admin");
        WebElement passFild = driver.findElement(By.xpath("//input[@name='password']"));
        passFild.sendKeys("admin");
        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
        loginButton.click();
        WebElement mainLogo = driver.findElement(By.xpath("//img[@class='center-block img-responsive']"));
        mainLogo.isDisplayed();
        driver.close();
    }
}
