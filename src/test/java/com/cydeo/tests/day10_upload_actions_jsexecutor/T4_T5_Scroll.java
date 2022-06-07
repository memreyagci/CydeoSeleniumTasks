package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class T4_T5_Scroll {
    @Test
    public void scroll() {
        /// Task 4

        // 1- Open a chrome browser
        // 2- Go to: https://practice.cydeo.com/
        WebDriver driver = Driver.getDriver();
        driver.get("https://practice.cydeo.com/");

        // 3- Scroll down to “Powered by CYDEO”
        WebElement footerText = driver.findElement(By.xpath("//*[@id='page-footer']/div/div"));

        Actions actions = new Actions(driver);
        actions.moveToElement(footerText).perform();


        /// Task 5
        // 1- Continue from where the Task 4 is left in the same test.
        // 2- Scroll back up to “Home” link using PageUP button
        //WebElement navHome = driver.findElement(By.className("nav-link"));
        actions.sendKeys(Keys.PAGE_UP).build().perform();
    }
}
