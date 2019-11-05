package selenium_all_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenuim_The_Second_practice {
    WebDriver driver;

    @Test
    public void Practice() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Achfri/Desktop/SeleniumDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get("http://www.amazon.com");
        System.out.println("the title of the web" + " " + driver.getTitle());
        driver.navigate().to("http://admin:admin@the-internet.herokuapp.com/basic_auth");
        String title = driver.getTitle();
        System.out.println("the title of the page:" + " " + title);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        String actule = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
        Assert.assertEquals(actule, "Congratulations! You must have the proper credentials.");
        System.out.println("passed");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Elemental Selenium')]")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Sortable Data Tables')]")).click();
        List<WebElement> colums = driver.findElements(By.xpath("//table[@id='table1']//tr//th"));
        colums.size();
        System.out.println(colums.size());
        for (WebElement col : colums) {
            System.out.println(col.getText());
        }
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        rows.size();
        System.out.println(rows.size());
        for (WebElement row : rows) {
            System.out.println(row.getText());
        }
        driver.navigate().to("https://accounts.google.com/signup");
        Thread.sleep(4000);
        WebElement txtFName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        WebElement txtLName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));

        txtFName.sendKeys("webdriver");

        Actions a = new Actions(driver);
        a.sendKeys(txtFName, Keys.chord(Keys.CONTROL, "a")).perform();
        Thread.sleep(4000);
        a.sendKeys(Keys.chord(Keys.CONTROL, "c")).perform();
        Thread.sleep(4000);
        a.sendKeys(txtLName, Keys.chord(Keys.CONTROL, "v")).perform();
        Thread.sleep(4000);
        driver.navigate().to("https://www.plus2net.com/javascript_tutorial/listbox-disabled-demo.php");
        driver.findElement(By.xpath("//form[1]//input[1]")).isEnabled();
        driver.findElement(By.xpath("//select[@id='l1']")).click();
        driver.quit();

    }
}
