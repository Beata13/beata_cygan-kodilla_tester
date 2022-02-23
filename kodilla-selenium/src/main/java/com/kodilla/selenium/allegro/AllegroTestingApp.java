package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");

        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"gh-ac-box2\"]/input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebElement productCategory = driver.findElement(By.xpath("//*[id=\"gh-cat-box\"]/select"));
        Select dronCategory = new Select(productCategory);
        dronCategory.selectByIndex(1);


    }
}
