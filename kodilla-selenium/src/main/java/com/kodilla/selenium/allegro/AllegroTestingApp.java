package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.pl/");

        WebElement inputField = driver.findElement(By.cssSelector(".gh-td-s>div>div>input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
        inputField.wait(1000);

        WebElement productCategory = driver.findElement(By.cssSelector("#gh-cat-td>div>select"));
        Select dronCategory = new Select(productCategory);
        dronCategory.selectByIndex(1);

        List<WebElement> element = driver.findElements(By.cssSelector(".gh-td-s>div>div>input"));
element.get(0).getText();

    }
}
