package com.d;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.quit();
//    driver.navigate().to("http://sqa.stackexchange.com");
    }
}
