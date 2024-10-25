package com.testingAcademy.Project01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class selenium02 {
    @Test

    public void test_001() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }
}
