package com.testingAcademy.Project01;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class selenium05 {
    @Test
    public void test01()
    {
        EdgeOptions edgeOptions = new EdgeOptions();

        EdgeDriver edgeDriver = new EdgeDriver(edgeOptions);
        edgeDriver.get("https://www.google.com");
        edgeDriver.manage().window().maximize();
        edgeDriver.close();
      //  edgeDriver.quit();


      //  driver.close();
        // Close the Current Browser Window - not the full browser
        // Closed the window, Session id != null, Error - Invalid session ID


       // driver.quit();
        // Close all the /sessions/windows and stop the browser
        //        driver.quit(); // Closed All the window and Session = null, Error - Session ID is null


    }
}
