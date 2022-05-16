package com.cydeo.homework.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EtsyTitleVerification {
    public static void main(String[] args) {
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        // 2. Go to https://www.etsy.com
        webDriver.get("https://www.etsy.com");

        // Accept cookies
        webDriver.findElement(By.id("gdpr-single-choice-overlay")).findElement(By.tagName("button")).click();

        // 3. Search for “wooden spoon”
        WebElement etsySearchBox = webDriver.findElement(By.id("global-enhancements-search-query"));
        etsySearchBox.sendKeys("wooden spoon", Keys.ENTER);

        // 4. Verify title:
        // Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = webDriver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is correct");
        } else {
            System.out.println("Unexpected title: " + actualTitle);
        }
    }
}
