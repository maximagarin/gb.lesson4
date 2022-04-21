package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
       //System.setProperty("webdriver.chrome.driver", "/Users/maximagarin/Desktop/Driver/chromedriver");
        //WebDriver driver = new ChromeDriver();
       WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.proskater.ru/");
        driver.manage().window().maximize();


        WebElement enter = driver.findElement(By.xpath("//a[@class='login-btn']"));
        enter.click();






    }
}
