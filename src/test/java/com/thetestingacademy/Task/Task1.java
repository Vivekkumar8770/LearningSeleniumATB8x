package com.thetestingacademy.Task;


//open the https://katalon-demo-cura.herokuapp.com/
//        Click on the make appointment button
//        Find username,password - enter them  , John Doe, ThisIsNotAPassword
//        Click on the submit button
//        Verify the driver. currentUrl == https://katalon-demo-cura.herokuapp.com/#appointment
//        Push the code to github.com


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1 {
    @Test
    public void testMethod01() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com");

        WebElement appointmentButton = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        appointmentButton.click();

        WebElement userName = driver.findElement(By.xpath("//input[@id='txt-username']"));
        userName.sendKeys("John Doe");

        WebElement password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement submit = driver.findElement(By.id("btn-login"));
        submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");

        driver.quit();
    }
}
