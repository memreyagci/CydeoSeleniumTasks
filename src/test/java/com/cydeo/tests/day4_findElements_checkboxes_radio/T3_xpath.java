package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T3_xpath {
    WebDriver driver = Driver.getDriver();

    @BeforeTest
    public void setup() {
        driver.get("http://practice.cydeo.com/multiple_buttons");
    }

    @Test
    public void clickButton1() {
        driver.findElement(By.xpath("*//button[1]")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='result']")).getText(), "Clicked on button one!");
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}
