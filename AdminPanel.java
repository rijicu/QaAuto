import com.google.gson.annotations.Until;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.ArrayList;
import java.util.List;

public class AdminPanel {

    @FindBy(id = "box-apps-menu")
    WebElement sideMenuContainer;

    @FindBy(className = "docs")
    WebElement insideMenuContainer;

    public AdminPanel() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public boolean isHeaderPresent() {
        return isElementPresent(By.tagName("h1"));
    }

    private String getHeaderText() {
        String h1Text = DriverFactory.getDriver().findElement(By.tagName("h1")).getText();
        return h1Text;
    }

    private boolean isElementPresent(By locator) {
        return !DriverFactory.getDriver().findElements(locator).isEmpty();
    }

    private List<WebElement> getSideMenuContainer() {
        return sideMenuContainer.findElements(By.id("app-"));
    }

    private List<WebElement> getInSideMenuContainer(){
        return insideMenuContainer.findElements(By.tagName("li"));
    }

    public void clickAllLinksInMenuAndCheckIsHeaderPresent(){
        int count = getSideMenuContainer().size();
        WebElement link;
        for (int i = 0; i < count; i++) {
            link = getSideMenuContainer().get(i);
            link.click();
            Assert.assertTrue(isHeaderPresent());
            if (isElementPresent(By.className("docs"))){
            int inCount = getInSideMenuContainer().size();
            System.out.println(inCount);
                for (int b = 0; b < inCount; b++){
                   WebElement inLink;
                   inLink = getInSideMenuContainer().get(b);
                    String spanText = inLink.findElement(By.tagName("span")).getText();
                    Assert.assertTrue(spanText.equals(getHeaderText()));
                    System.out.println(spanText);
                   inLink.click();
                   Assert.assertTrue(isHeaderPresent());
                }
            }
        }
    }

}
