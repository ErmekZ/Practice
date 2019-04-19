package recap;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Test {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


//        driver.get("http://the-internet.herokuapp.com/javascript_alerts");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
// Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//        alert.dismiss();
//
//        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
//        alert.sendKeys("hello");
//        alert.accept();

//        driver.get("http://automationpractice.com/index.php");
//        Thread.sleep(2000);
//
//        WebElement iframe   =  driver.findElement(By.xpath("//*[@id='facebook_block']/div/div/span/iframe"));
//        Thread.sleep(2000);
//
//        driver.switchTo().frame(iframe);
//        Thread.sleep(2000);
//
//        String ele = driver.findElement(By.xpath("//*[@id='u_0_6']")).getText();
//        System.out.println(ele);

        ((JavascriptExecutor) driver).executeScript("window.open('http://www.google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://www.etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://www.openxcell.com','_blank');");

    }


    }

