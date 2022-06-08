package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T5_Dropdown {
    @Test
    public void dropdown() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");

        Select stateDropdown = new Select(Driver.getDriver().findElement(By.id("state")));
        stateDropdown.selectByValue("IL");
        stateDropdown.selectByVisibleText("Virginia");
        stateDropdown.selectByIndex(5);

        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "California");
    }
}
