package recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Typeracer {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://play.typeracer.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.linkText("Cancel")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Enter a typing race")).click();

        Thread.sleep(14000);
        String text = driver.findElement(By.xpath("//*[@id='gwt-uid-15']/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td/div/div/span[1]")).getText();
        text += driver.findElement(By.xpath("//*[@id='gwt-u" +
                "" +
                "id-15']/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td/div/div/span[2]")).getText();
        try{
            text += " "+ driver.findElement(By.xpath("//*[@id='gwt-uid-15']/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td/div/div/span[3]")).getText();
        } catch (Exception e){
            System.out.println("no span 3");

        }

        driver.findElement(By.className("txtInput")).sendKeys(text);

        Thread.sleep(15000);

        driver.quit();
        
    }
}
