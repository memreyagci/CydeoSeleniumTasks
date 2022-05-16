package com.cydeo.homework.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification {
    public static void main(String[] args) {
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        // 2. Go to http://zero.webappsecurity.com/login.html
        webDriver.get("http://zero.webappsecurity.com/login.html");

        // 3. Verify header text
        // Expected: “Log in to ZeroBank”
        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = webDriver.findElement(By.tagName("h3")).getText();

        if(actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header text is verified.");
        } else {
            System.out.println("Unexpected header text: " + actualHeaderText);
        }
    }
}
