package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.OrangeHomePage;
import pages.OrangeLoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.TestBase;

import java.util.List;

public class OrangeAdmin extends TestBase {
    @Ignore
    @Test
    public void login(){
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement admin = driver.findElement(By.id("welcome"));
        Assert.assertTrue(admin.isDisplayed());

    }
    @Ignore
    @Test
    public void loginVerification(){
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        OrangeLoginPage olp = new OrangeLoginPage();
//        olp.username.sendKeys("Admin");
//        olp.password.sendKeys("admin123");
//        olp.loginBtn.click();
        olp.login("Admin", "admin123");
        OrangeHomePage ohp = new OrangeHomePage(driver);
        Assert.assertTrue(ohp.welcomeAdmin.isDisplayed());
        ohp.welcomeAdmin.click();
        ohp.aboutDisplay.click();
        Assert.assertTrue((ohp.companyInfo.getText().contains("OrangeHRM")));
    }
    @Ignore
    @Test
    public void JobTitleVerification(){
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        OrangeLoginPage olp = new OrangeLoginPage();
        olp.login("Admin", "admin123");

        OrangeHomePage ohp = new OrangeHomePage(driver);
        Actions actions = new Actions(driver);

        actions.moveToElement(ohp.performanceBtn).moveToElement(ohp.ConfigureBtn).moveToElement(ohp.KpiBtn).click().perform();

//        List<WebElement> jobTitlesText = ohp.JobTitles.getText();

        Select jobTitle = new Select(ohp.JobTitleDropdown);
        List <WebElement> options = jobTitle.getOptions();
        boolean found = false;
        for (WebElement option :options){
            System.out.println(option.getText());
            if(option.getText().equals("CEO")){
                found = true;
                break;
            }
        }
        Assert.assertTrue(found);
    }

//    @Test
//    public void negativeLogin(){
//        Driver.getDriver().get(Config.getProperty());
//    }

}
