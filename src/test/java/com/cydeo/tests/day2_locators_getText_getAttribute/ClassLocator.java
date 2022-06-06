package com.cydeo.homework.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {
    public static void main(String[] args) {
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        // 2- Go to: https://practice.cydeo.com/inputs
        webDriver.get("https://practice.cydeo.com/inputs");

        // 3- Click to “Home” link
        webDriver.findElement(By.className("nav-link")).click();

        // 4- Verify title is as expected:
        // Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = webDriver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("The title is verified");
        } else {
            System.out.println("Unexpected title: " + actualTitle);
        }
    }
}
