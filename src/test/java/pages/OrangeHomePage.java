package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHomePage {
    WebDriver driver;
    public OrangeHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="welcome" )
    public WebElement welcomeAdmin;

    @FindBy(id ="aboutDisplayLink" )
    public WebElement aboutDisplay;

    @FindBy(xpath ="//*[@id='welcome-menu']/ul/li[2]/a" )
    public WebElement logout;

    @FindBy(id = "companyInfo")
    public WebElement companyInfo;

    @FindBy(id = "menu__Performance")
    public  WebElement performanceBtn;


    @FindBy(id = "menu_performance_Configure")
    public  WebElement ConfigureBtn;

    @FindBy(id = "menu_performance_searchKpi")
    public  WebElement KpiBtn;

    @FindBy(id = "kpi360SearchForm_jobTitleCode")
    public WebElement JobTitleDropdown;

}
