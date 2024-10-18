package com.testingAcademy.Project01;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class selenium02 {
    @Test

    public void test_001() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://sdet.live");
        driver.quit();
    }
}
