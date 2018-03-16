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

    private WebDriver webDriver;
    private By catalogItem = By.xpath("/html/body/nav/ul/li[4]/a/span");
    private By productItem = By.xpath("/html/body/nav/ul/li[4]/ul/li[1]/a");
    private By headerProducts = By.xpath("//*[@id=\"main-div\"]/div[1]/h2");
    private By newProductBtn = By.id ("page-header-desc-configuration-add");
    private By saveBtn = By.class ("btn btn-primary js-btn-save");

    public void open() {

        webDriver.get(Properties.getBaseAdminUrl());
    }

    public  ProductPage (WebDriver driver) {

        this.webDriver = driver;
    }

    @Test
    public void prodPageIsDisplayed () {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(catalogItem));
        WebElement catalogElement = webDriver.findElement(catalogItem);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(catalogElement).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(productItem));
        webDriver.findElement(productItem).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(headerProducts));
        Assert.assertTrue(headerProducts).isDisplayed, "Products header is not displaed");


    }
    @Test
    public void newProdPageIsDisplayed () {
    WebDriverWait wait = new WebDriverWait(webDriver, 10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(newProductBtn));
    webDriver.findElement(newProductBtn).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(saveBtn));
    Assert.assertTrue(saveBtn).isDisplayed, "Buuton is not displayed");

   //wait when page is loaded

}


@Test
public void newProdCreating {

    }


}
