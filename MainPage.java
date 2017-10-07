import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class MainPage {



    WebDriver driver = new ChromeDriver();
 // WebDriver driver;

    WebElement myStore = driver.findElement(By.xpath("//*[@id=\"header\"]/a/img"));
/*    @FindBy(xpath = "//*[@id=\"header\"]/a/img")
            WebElement myStore;*/
    WebElement userRegion = driver.findElement(By.id("region"));
    WebElement itemInCart = driver.findElement(By.className("quantity"));
    WebElement searchFild = driver.findElement(By.name("query"));
    //By searchFild = By.name("query")
    WebElement categoryList = driver.findElement(By.id("box-category-tree"));
    WebElement userLoginFild = driver.findElement(By.name("email"));
    WebElement userPassFild = driver.findElement(By.name("password"));
    WebElement loginButton = driver.findElement(By.name("login"));

    MainPage(WebDriver driver){
        this.driver = driver;
    }

}
