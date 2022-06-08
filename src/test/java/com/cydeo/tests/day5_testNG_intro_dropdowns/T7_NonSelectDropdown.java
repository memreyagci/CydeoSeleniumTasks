package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T7_NonSelectDropdown {
    @Test
    public void nonSelectDropdown() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");

        Driver.getDriver().findElement(By.id("dropdownMenuLink")).click();
        Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div/a[4]")).click();

        Assert.assertEquals(Driver.getDriver().getTitle(), "Facebook – log in or sign up");
    }
}