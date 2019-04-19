package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Orange {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void orangeTitleVerification(){

        Assert.assertEquals(driver.getTitle(),"OrangeHRM","Orange HRM verification ");
    }

    @Test
    public void orangeLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("123");
    }
    @BeforeMethod
    public void beforeMethod(){
        driver.get("https://opensource-demo.orangehrmlive.com/");
    driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod(){
   // driver.close();
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
