package recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Tables {
    public static void main(String[] args) {
        WebDriver  driver = new ChromeDriver();

        driver.get("http://cybertekchicago.com");
        List<WebElement> phNumbers = new ArrayList<>();

        driver.findElements(By.xpath("(//table)[1]/tr[1]/td[6]"));
    }
}
