import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    @Test
    public void laptopIsPresentOnThePage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rozetka.com.ua/");
        WebElement menuItem = driver.findElement(By.id("2416"));
        menuItem.click();
        driver.findElement(By.xpath("//*[@id=\"content-inner-block\"]/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div[1]/div/ul/li[1]/a"));

    }

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
