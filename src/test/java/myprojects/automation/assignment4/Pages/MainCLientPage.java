package myprojects.automation.assignment4.Pages;

import myprojects.automation.assignment4.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainCLientPage {

    private WebDriver webDriver;
    private By allProducts = By.id("//*[@id=\"content\"]/section/a/text()");
    private By mainPageBlock = By.xpath("//*[@id=\"main\"]/div[1]/h1");
    private By searchField = By.class("material-icons search");
    private By searchResults = By.xpath("//*[@id=\"main\"]/h2");



    public void open() {

        webDriver.get(Properties.getBaseUrl());
    }


    public MainClientPage (WebDriver webDriver) {

        this.webDriver = webDriver;
    }
    public void clickByLinkAllProd (){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated (mainPageBlock));
        webDriver.findElement(allProducts).click();
    }

    public void findAddedProd () //як зберегти згенеровану назву товару, щоб зараз ввести її у пошук?

    {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        webDriver.findElement(searchField).sendKeys();
        webDriver.findElement(searchField).submit();
        wait.until(ExpectedConditions.visibilityOfElementLocated (searchResults));
        Assert.assertEquals();
      // я не знаю як перевірити, що відображений той товар, який ми ввели в поле пошуку

    }

    public void verifyParametersProd(){

    }
}

//
Часть Б. Проверка отображения продукта:
        1. Перейти на главную страницу магазина.
        2. Перейти к просмотру всех продуктов воспользовавшись ссылкой «Все товары».
        Добавить проверку (Assertion), что созданный в Админ Панели продукт отображается на странице.
        3. Открыть продукт. Добавить проверки, что название продукта, цена и количество соответствует значениям,
        которые вводились при создании продукта в первой части сценария.


