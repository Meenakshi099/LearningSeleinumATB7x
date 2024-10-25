package com.testingAcademy.EX19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyApp {
    @Description("Verify that with invalid email, pass, error message is shown on the app.vwo.com")
    @Test

    public void NegativeTestCase(){
        // How to find the elements
        // Selenium
        // ID, NAME, CLASS NAME, TAGName,
        // Advance -> Css Selector, Xpath

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("admin@admin.com");

        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("12345");

        WebElement rem = driver.findElement(By.id("checkbox-remember"));
        rem.submit();


        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();



        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        WebElement error_message = driver.findElement(By.id("js-notification-box"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");



    }
}
