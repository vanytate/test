package myprojects.automation.assignment4.Pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPage {

    private By catalogItem = By.id("subtab-AdminCatalog");
    private By productItem = By.xpath("/html/body/nav/ul/li[4]/ul/li[1]/a");
    private By newProductBtn = By.id ("page-header-desc-configuration-add");
    private By saveBtn = By.class ("btn btn-primary js-btn-save");
    public CategoryPage(WebDriver driver) {
        this.driver = driver;
    }
@Test
    public void clickProductSubmenu () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(catalogItem));
        WebElement catalogElement = driver.findElement(catalogItem);
        Actions actions = new Actions(driver);
        actions.moveToElement(catalogElement).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(productItem));
        driver.findElement(productItem).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(newProductBtn));
        driver.findElement(newProductBtn).click();
    Assert.assertEquals(driver.findElement(saveBtn).isDisplayed, "Buuton is not displayed");

    }


    }

}
