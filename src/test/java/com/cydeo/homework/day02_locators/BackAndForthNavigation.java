package com.cydeo.homework.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) {
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        // 2- Go to: https://google.com
        webDriver.get("https://google.com");

        // Accept terms & conditions:
        webDriver.findElement(By.id("L2AGLb")).click();

        // 3- Click to Gmail from top right.
        webDriver.findElement(By.linkText("Gmail")).click();

        // 4- Verify title contains:
        // Expected: Gmail
        String pageTitle = webDriver.getTitle();

        if (pageTitle.contains("Gmail")){
            System.out.println("Page title contains \"Gmail\"");
        } else {
            System.out.println("Page title does not contain \"Gmail\": " + pageTitle);
        }

        // 5- Go back to Google by using the .back();
        webDriver.navigate().back();

        // Verify title equals:
        // Expected: Google
        String expectedTitle = "Google";
        String actualTitle = webDriver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("The title is verified");
        } else {
            System.out.println("Unexpected title: " + actualTitle);
        }
    }
}
