import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class IsElementsPresentOnThePage {

    @Test
    public void isElementsPresentOnThePage() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost/");
        WebElement myStore = driver.findElement(By.xpath("//*[@id=\"header\"]/a/img"));
        myStore.isDisplayed();
        WebElement userRegion = driver.findElement(By.id("region"));
        userRegion.isDisplayed();
        WebElement itemInCart = driver.findElement(By.className("quantity"));
        itemInCart.isDisplayed();
        WebElement searchFild = driver.findElement(By.name("query"));
        searchFild.isDisplayed();
        WebElement categoryList = driver.findElement(By.id("box-category-tree"));
        categoryList.isDisplayed();
        WebElement userLoginFild = driver.findElement(By.name("email"));
        userLoginFild.isDisplayed();
        WebElement userPassFild = driver.findElement(By.name("password"));
        userPassFild.isDisplayed();
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.isDisplayed();


    }
}
