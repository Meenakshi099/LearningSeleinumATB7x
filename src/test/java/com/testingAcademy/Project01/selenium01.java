package com.testingAcademy.Project01;

import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium01 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
       driver.get("https://app.vwo.com");
    }
}
