package TestCase;

import BasePage.BasePage;
import Pages.Login;
import Pages.PurchaseItem;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestCase extends BasePage {
    Login objLogin;
    PurchaseItem objPurchase;
    @Test(priority=1,enabled = true, description="Login")
    public void doLogin() throws Exception {
        driver.get("http://automationpractice.com");
        objLogin=new Login(driver);
        objLogin.doLogin("testuser9454@test.com","P@ssword123");
    }
    @Test(priority=2,enabled = true, description="Purchase Item")
    public void doPurchage() throws Exception {
        objPurchase=new PurchaseItem(driver);
        objPurchase.purchaseItem();

    }
    @AfterTest
    public void Logout() throws InterruptedException {
        driver.quit();

    }
}

