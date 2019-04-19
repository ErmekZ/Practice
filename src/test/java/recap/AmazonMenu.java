package recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utilities.TestBase;

public class AmazonMenu extends TestBase {
@Ignore
    @Test
    public void amazonTitle() throws InterruptedException {
        driver.get("http://amazon.com");
        Actions action = new Actions(driver);
        WebElement nav = driver.findElement(By.id("icp-nav-flyout"));
        action.moveToElement(nav).perform();
        Thread.sleep(10000);



    }
    @Ignore
    @Test
    public void doubleClick() throws InterruptedException {
        driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
        Actions action = new Actions(driver);
        WebElement dc = driver.findElement(By.id("fold_header"));
        action.moveToElement(dc).perform();
        Thread.sleep(3000);
        WebElement footer = driver.findElement(By.className("footer-info-left"));
        action.moveToElement(footer).perform();

    }
    @Ignore
    @Test
    public  void dragAndDrop() throws InterruptedException {
    driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
    Actions action = new Actions(driver);
    WebElement drag = driver.findElement(By.id("draggable"));
    WebElement drop = driver.findElement(By
            .id("droptarget"));

   // action.dragAndDrop(drag,drop).perform();
    action.clickAndHold(drag).moveToElement((drop)).perform();
    Thread.sleep(3000);
    }
    @Test
    public void upload() throws InterruptedException {
    driver.get("http://the-internet.herokuapp.com/upload");
    WebElement upload = driver.findElement(By.id("file-upload"));

    upload.sendKeys("C:\\Users\\eliza\\Desktop\\download.jpg");

    Thread.sleep(5000);

    driver.findElement(By.id("file-submit")).click();
    Thread.sleep(10000);


    }


}
