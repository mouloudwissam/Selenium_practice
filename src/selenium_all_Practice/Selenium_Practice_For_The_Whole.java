package selenium_all_Practice;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Selenium_Practice_For_The_Whole  {
    WebDriver driver;

    @Test
    public void Open_Browser() throws InterruptedException, IOException {
        File src1 = new File("C:/JavaPrograming/src/selenium_all_Practice/sources_1..properties");
        FileInputStream fis1 = new FileInputStream(src1);
// Create Properties class object to read properties file
        Properties pro = new Properties();
// Load file so we can use into our script
        pro.load(fis1);
        System.setProperty("webdriver.chrome.driver", "C:/Users/Achfri/Desktop/SeleniumDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(pro.getProperty("Google_Url"));
//        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(33, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(34, TimeUnit.SECONDS);
        driver.getCurrentUrl();
        System.out.println(" get CurrentUrl:" + " " + driver.getCurrentUrl());
        if (driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).isEnabled()) {
            System.out.println("the search Box is enabled:");
            driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(pro.getProperty("name_of_Google"));
            driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
        } else {
            System.out.println("The saerch box is not enable:");
        }
        WebElement clikonlicnk = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3"));
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).click(clikonlicnk).keyUp(Keys.CONTROL).keyUp(Keys.SHIFT).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://www.Amazon.com");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.getTitle();
        System.out.println("print the title of page amazon:" + " " + driver.getTitle());
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.navigate().forward();
//        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(screenshot, new File("C:/Users/Achfri/Desktop/New folder"));
//        System.out.print("Screenshot is captured and stored in your D: Drive");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.navigate().to("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"post-body-4292417847084983089\"]/div[1]/input")).click();
        Alert alert = driver.switchTo().alert();
        String alertone = alert.getText();
        System.out.println("the alert message is :" + alertone);
        Thread.sleep(4000);
        alert.accept();

        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[contains(text(),'Show Me Confirmation')]")).click();
        Alert alert1 = driver.switchTo().alert();
        String alerttwo = alert1.getText();
        System.out.println("the alert message is :" + " " + alerttwo);
        alert1.accept();

        driver.manage().timeouts().implicitlyWait(34, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[contains(text(),'Show Me Prompt')]")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.getText();
        System.out.println("the alert message is :" + alert2.getText());
        driver.manage().timeouts().implicitlyWait(34, TimeUnit.SECONDS);
        alert2.sendKeys("Jhon");
        driver.manage().timeouts().implicitlyWait(34, TimeUnit.SECONDS);
        alert2.accept();

        driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
        driver.navigate().to("http://only-testing-blog.blogspot.com/2014/06/alert_6.html");
        driver.manage().timeouts().implicitlyWait(34, TimeUnit.SECONDS);

        try {
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("unexpected alert!!");
        }

        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("fname");

        driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("lname");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.navigate().to("http://only-testing-blog.blogspot.com/2014/05/login.html");
        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Example Login Page')]")).getCssValue("front-size"));
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Example Login Page')]")).getCssValue("color"));
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Example Login Page')]")).getCssValue("front-family"));
        Thread.sleep(3000);
        driver.navigate().to("http://only-testing-blog.blogspot.com/p/mouse-hover.html");
        driver.manage().timeouts().implicitlyWait(34, TimeUnit.SECONDS);


        Actions action1 = new Actions(driver);
        WebElement mouse_Hover = driver.findElement(By.xpath("//div[contains(text(),'Search Engine')]"));
        WebElement mouse_hover1 = driver.findElement(By.xpath("//a[contains(text(),'Google')]"));
        action1.moveToElement(mouse_Hover);
        Thread.sleep(3000);
        action1.moveToElement(mouse_hover1).click().perform();
        try {
            // Specify the path of file
            File src = new File("C:/Users/Achfri/Documents/New Text Document.xlsx");
            // load file
            FileInputStream fis = new FileInputStream(src);
            // Load workbook
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            // Load sheet- Here we are loading first sheetonly
            XSSFSheet sh1 = wb.getSheetAt(0);
            // getRow() specify which row we want to read.
            // and getCell() specify which column to read.
            // getStringCellValue() specify that we are reading String data.
            System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
            System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
            System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
            System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
            System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
            System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
            // here createCell will create column
            // and setCellvalue will set the value
            sh1.getRow(0).createCell(2).setCellValue("2.41.0");
            sh1.getRow(1).createCell(2).setCellValue("2.5");
            sh1.getRow(2).createCell(2).setCellValue("2.39");
            // here we need to specify where you want to save file
            FileOutputStream fout = new FileOutputStream(new File("C:/Users/Achfri/Documents/New Text Document.xlsx"));
            // finally write content
            wb.write(fout);
            // close the file
            fout.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        driver.navigate().back();


        Actions action2 = new Actions(driver);
        WebElement mouse1 = driver.findElement(By.xpath("//div[contains(text(),'E-Commerce')]"));
        WebElement mouse2 = driver.findElement(By.xpath("//a[contains(text(),'EBay')]"));
        action2.moveToElement(mouse1);
        Thread.sleep(3000);
        action2.moveToElement(mouse2).click().perform();
        Thread.sleep(3000);
        driver.navigate().back();


        Actions action3 = new Actions(driver);
        WebElement hover = driver.findElement(By.xpath("//div[contains(text(),'e-Books')]"));
        WebElement hover1 = driver.findElement(By.xpath("//a[contains(text(),'JavaScriptRef')]"));
        action3.moveToElement(hover);
        Thread.sleep(4000);
        action3.moveToElement(hover1).click().build().perform();
        driver.navigate().to("http://www.ebay.com");
        List<WebElement> list = driver.findElements(By.tagName("a"));
        list.size();
        System.out.println("the size of elements:" + " " + list.size());
        for (int i = 0; i >= list.size(); i++) {
            System.out.println("print all the elements" + " " + i);

            File src = new File("C:/Users/Achfri/Downloads/Sample Excel.xlsx");
            try {
                // Workbook is a class in Jexcel which will take file as an argument and getWork
                // book is a predefined method which will read the workbook and will return the w
                // Workbook object
                Workbook wb = Workbook.getWorkbook(src);
                // Workbook is loaded now we have to load sheet so using workbook object (wb) we
                // can call getSheet method which will take index as an argument and will load
                // the sheet, we can also specify the sheetname also
                Sheet sh1 = wb.getSheet(0);
                // Sheet is loaded then we have to read cell so using sh1 object call getCell me
                // method which we take two arguments getCell(column,row)
                Cell c1 = sh1.getCell(0, 0);
                //Cell is loaded then using getContents method we have to extract the data using
                // getContents() methods
                // this method will always return you String.
                // now you are done
                String data1 = c1.getContents();
                System.out.println(data1);
                System.out.println("Sheet data is " + data1);
            } catch (BiffException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        driver.quit();
    }
}





