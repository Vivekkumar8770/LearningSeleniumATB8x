package com.thetestingacademy.Task;

//Open the https://www.idrive360.com/enterprise/login
//Enter the credentials
//email - augtest_040823@idrive.com
//password - 123456
//Verify that the free trial message is visible.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Task3 {
    @Test
    public void testModule1() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.idrive360.com/enterprise/login");

        driver.findElement(By.id("username")).sendKeys("xyz");



        Thread.sleep(3000);
        driver.quit();
    }
}
