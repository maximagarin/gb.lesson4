package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class App 
{ static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException {

        driver = WebDriverManager.chromedriver().create();
        driver.get("https://github.com");
        driver.manage().window().maximize();
        WebElement signIN = driver.findElement(By.xpath("//a[@href='/login']"));
        signIN.click();
        Thread.sleep(2000);

        //1 Incorrect username or password. c неправильным логином и паролем
        WebElement signInButton = driver.findElement(By.xpath(" //input[@value='Sign in']"));
        Thread.sleep(2000);
        register("ipeji", "klesvh");
        Thread.sleep(2000);

        //2     Incorrect username or password. c пробелом
        driver.get("https://github.com");
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        Thread.sleep(2000);
        register(" ", " ");

        //3 Incorrect username or password. с пустыми полями
        driver.get("https://github.com");
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        Thread.sleep(2000);
    }
   static void register(String username, String password) {
        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
       driver.findElement(By.xpath(" //input[@value='Sign in']")).click();
       return;


    }
}
