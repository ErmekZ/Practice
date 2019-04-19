package webTables;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.List;

public class SmartBear extends TestBase {

    @Test
    public void locator() throws InterruptedException {
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);

        WebElement orderTable = driver.findElement(By.id("ctl00_MainContent_orderGrid"));

        List< WebElement> rowData =  orderTable.findElements(By.tagName("tr"));
        Thread.sleep(2000);
        for(WebElement row: rowData){
          List <WebElement> columns = row.findElements(By.tagName("td"));
        for ( WebElement column: columns){
          System.out.print(column.getText()+" | ");
   }

    System.out.println();
    System.out.println("------------------------------------");
}

        coordinates(5,6);




    }

    public void coordinates(int rowNum, int columnNum){


        System.out.println(driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']//tr["+(rowNum+1)+"]/td["+(columnNum+1)+"]")).getText());


    }
}
