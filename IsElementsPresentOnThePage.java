import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class IsElementsPresentOnThePage {



    @Test
    public void isElementsPresentOnThePage() {
        //WebDriver driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost/");


        mainPage.myStore.isDisplayed();
        mainPage.userRegion.isDisplayed();
        mainPage.itemInCart.isDisplayed();
        mainPage.searchFild.isDisplayed();
        mainPage.categoryList.isDisplayed();
        mainPage.userLoginFild.isDisplayed();
        mainPage.userPassFild.isDisplayed();
        mainPage.loginButton.isDisplayed();
    }
}
