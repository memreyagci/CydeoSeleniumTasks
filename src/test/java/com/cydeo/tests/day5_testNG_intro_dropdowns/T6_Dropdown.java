package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T6_Dropdown {
    @Test
    public void dropdown() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");

        Select dateOfBirthYearDropdown = new Select(Driver.getDriver().findElement(By.id("year")));
        dateOfBirthYearDropdown.selectByVisibleText("1923");

        Select dateOfBirthMonthDropdown = new Select(Driver.getDriver().findElement(By.id("month")));
        dateOfBirthMonthDropdown.selectByValue("11");

        Select dateOfBirthDayDropdown = new Select(Driver.getDriver().findElement(By.id("day")));
        dateOfBirthDayDropdown.selectByIndex(0);

        Assert.assertEquals(
                dateOfBirthMonthDropdown.getFirstSelectedOption().getText() + " " + dateOfBirthDayDropdown.getFirstSelectedOption().getText() + "st, " + dateOfBirthYearDropdown.getFirstSelectedOption().getText(),
                "December 1st, 1923");
    }
}