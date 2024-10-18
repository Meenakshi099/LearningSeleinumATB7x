package com.testingAcademy.Project01;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class selenium04 {
    @Test
    public void testmethod01()
    {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("-- start-maximized");
        edgeOptions.addArguments("maximum");
        //edgeOptions.addArguments("--window-size =800,600");


        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");
    }
}
