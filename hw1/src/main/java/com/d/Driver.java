package com.d;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.quit();
        System.out.println("1 + 2 = " + 1 + 2);
        //String
    }
}
