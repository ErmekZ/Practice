package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCPositive {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver  = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/ login.aspx");
        String title = driver.getTitle();

        if (title.equals("Web Orders Login")){
            System.out.println("title passed");
        }else {
            System.out.println("title failed");
        }

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

        String webTitle = driver.getTitle();

        if(webTitle.equals("Web Orders")){
            System.out.println("title verified");
        }else {
            System.out.println("title is not correct");
        }

        String url = driver.getCurrentUrl();
        if (url.equals("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/")){
            System.out.println("url is correct");
        }else {
            System.out.println("url is not correct");
        }
    }
}
