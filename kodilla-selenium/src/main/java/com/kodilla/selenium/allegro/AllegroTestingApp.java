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
        driver.get("https://allegro.pl/");
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement productCategory = driver.findElement(By.xpath("//*[@data-prototype-id=\"allegro.metrumHeader.search\"]/div/div/div/select[3]"));
        Select yearSelect = new Select(productCategory);
        WebElement mavicMini = driver.findElement(By.xpath("//*[@data-prototype-id=\"allegro.metrumHeader.search\"]/div/inut"));
        mavicMini.sendKeys("Mavic mini");
    }
}
