package com.thetestingacademy.JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium24 {
    @Test
    public void testMethod01() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        String URL = "https://selectorshub.com/xpath-practice-page/";
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get(URL);
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        js.executeScript("arguments[0].scrollIntoView(true);", div_to_scroll);

        //js.executeScript("window.scrollTo(0,1000)");


        Thread.sleep(3000);
        driver.quit();


    }
}