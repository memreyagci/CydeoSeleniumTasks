package com.cydeo.tests.day8_properties_config_reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T3_getTableEmail {
    public void getTableGetEmail(WebDriver driver, String tableNum, String firstName) {
        String email = driver.findElement(By.xpath("//*[@id='table" + tableNum + "']//td[.='" + firstName + "']/following-sibling::td[3]")).getText();
    }
}
