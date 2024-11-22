package com.testingAcademy.EX19102024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWorkLink {

    @Description("Verify that with invalid email, pass, error message is shown on the opencart.com")
    @Test
     public void OpenCart(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");
        System.out.println(driver.getTitle());
        //Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://awesomeqa.com/ui/index.php?route=account/register");

        WebElement firstName = driver.findElement(By.xpath("//input[@id='input-firstname']"));
              firstName.sendKeys("Meenu");

        WebElement lastname = driver.findElement(By.cssSelector("#input-lastname"));
        lastname.sendKeys("Gopi");

        WebElement email = driver.findElement(By.id("input-email"));
       email.sendKeys("admin@admin.com");

       WebElement telephone = driver.findElement(By.name("telephone"));
       telephone.sendKeys("984938930300");

       WebElement password = driver.findElement(By.cssSelector("#input-password"));
       password.sendKeys("1239884");

       WebElement passconfirm = driver.findElement(By.id("input-confirm"));
       passconfirm.sendKeys("1239884");

       WebElement subscribe = driver.findElement(By.name("newsletter"));
       subscribe.click();

       WebElement agreee = driver.findElement(By.name("agree"));
       agreee.click();

        WebElement button_submit = driver.findElement(By.xpath("//input[@value='Continue']"));
        button_submit.click();

        WebElement message = driver.findElement(By.xpath("//div[text()=' Warning: E-Mail Address is already registered!']"));
        Assert.assertEquals(message.getText(),"Warning: E-Mail Address is already registered!");
    }

}
//Pa$$w0rd!
//admin123.admin@gmail.com