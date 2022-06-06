package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_AlertPractices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage() .timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alertTest3() {
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='result']")).getText(), "You entered: hello");
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}
