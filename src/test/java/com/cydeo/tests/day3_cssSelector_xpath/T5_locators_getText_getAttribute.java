package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T5_locators_getText_getAttribute {
    WebDriver driver = Driver.getDriver();

    @BeforeTest
    public void setup() {
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
    }

    @Test
    public void resetPassword() {
        WebElement usernameInputBox = driver.findElement(By.name("USER_LOGIN"));
        usernameInputBox.sendKeys("awrongusername");

        driver.findElement(By.className("login-btn")).click();

        Assert.assertEquals(driver.findElement(By.className("errortext")).getText(), "Login or E-mail not found");
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}