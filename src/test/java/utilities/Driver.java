package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.lang.String;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){

    }

    static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){
            switch (Config.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "internet explorer":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
            }

        }
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
        return driver;
    }

    public static void closeDriver(){
        if (driver!= null){
            driver.quit();
            driver = null;
        }
    }


}
