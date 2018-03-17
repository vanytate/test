package myprojects.automation.assignment4;


import myprojects.automation.assignment4.Pages.LoginPage;
import myprojects.automation.assignment4.Pages.ProductPage;
import myprojects.automation.assignment4.model.ProductData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Contains main script actions that may be used in scripts.
 */
public class GeneralActions {
    private WebDriver driver;
    private WebDriverWait wait;

    public GeneralActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    /**
     * Logs in to Admin Panel.
     * @param login
     * @param password
     */
    public void login(String login, String password) {
        // TODO implement logging in to Admin Panel
      //  throw new UnsupportedOperationException();
            LoginPage loginPage = new LoginPage(driver);
            loginPage.open();
            loginPage.fillEmailInput(login);
            loginPage.fillPasswordInput(password);
            loginPage.clickLoginButton();
        }



    public void createProduct(ProductData newProduct) {
        // TODO implement product creation scenario
     //   throw new UnsupportedOperationException();
        ProductPage productPage = new ProductPage(driver);
        productPage.open();
        productPage.allProdPageIsDisplayed();
        productPage.newProdPageIsDisplayed();
        productPage.newProdIsCreated();
    }

    /**
     * Waits until page loader disappears from the page
     */
    public void waitForContentLoad() {
        // TODO implement generic method to wait until page content is loaded

        // wait.until(...);
        // ...
    }
}
