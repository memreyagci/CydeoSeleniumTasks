package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class T8_MultipleSelectDropdown {
    private static WebDriver driver = Driver.getDriver();

    @BeforeTest
    public void setup() {
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void selectAll() {
        Select programmingLanguages = new Select(driver.findElement(By.name("Languages")));
        List<WebElement> programmingLanguagesList = driver.findElements(By.xpath("//select[@name='Languages']//option"));
        for (WebElement eachLanguage : programmingLanguagesList) {
            programmingLanguages.selectByVisibleText(eachLanguage.getText());
        }

        //4. Print out all selected values.
        for (WebElement eachLanguage : programmingLanguagesList) {
            if (eachLanguage.isSelected()){
                System.out.println(eachLanguage.getText());
            }
        }

        //5. Deselect all values.
        programmingLanguages.deselectAll();
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}