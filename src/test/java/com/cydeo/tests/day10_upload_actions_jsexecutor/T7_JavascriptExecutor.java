package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_JavascriptExecutor {
    @Test
    public void javascriptExecutor() {
        // 1- Open a chrome browser
        // 2- Go to: https://practice.cydeo.com/large
        WebDriver driver = Driver.getDriver();
        driver.get("https://practice.cydeo.com/large");

        // 3- Scroll down to “Cydeo” link
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        WebElement cydeoLink = driver.findElement(By.xpath("//*[@id='page-footer']/div/div/a"));
        jsExecutor.executeScript("arguments[0].scrollIntoView(false)", cydeoLink);
        BrowserUtils.sleep(3);

        // 4- Scroll up to “Home” link
        WebElement navHome = driver.findElement(By.className("nav-link"));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true)", navHome);
    }
}
