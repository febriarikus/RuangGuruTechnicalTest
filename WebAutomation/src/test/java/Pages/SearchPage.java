package Pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends PageObject {
    public void checkSearchBoxAlreadyDisplayed(){
        getDriver().findElement(By.xpath("//input[@data-testid='search-input-field']")).isDisplayed();
    }

    public void inputKeyword(String keyword){
        getDriver().findElement(By.xpath("//input[@data-testid='search-input-field']")).sendKeys(keyword);
    }

    public void clickSearchButton(){
        getDriver().findElement(By.xpath("//div[@data-testid='search-icon']")).click();
    }

    public void getsTheResultOfKeywordEntered(String keyword) {
        List<WebElement> title = getDriver().findElements(By.xpath("//h2[@data-testid='course-title']"));
        Assert.assertTrue(title.get(1).getText().contains(keyword));
    }

    public void getsNoResultFoundPage() {
        getDriver().findElement(By.xpath("//div[@data-testid='empty-result-card']")).isDisplayed();
    }
}