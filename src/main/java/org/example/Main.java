package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://komputronik.pl");

        By.ByCssSelector zgadzamSieNaWszystkie = new By.ByCssSelector("#onetrust-accept-btn-handlera");
        driver.findElement(zgadzamSieNaWszystkie).click();

        By.ByCssSelector followUpCloseButton = new By.ByCssSelector(".webpush-followup-close");
        driver.findElement(followUpCloseButton).click();

        By.ByCssSelector wsparcieKomputronikSelector = new By.ByCssSelector("a[href='https://www.komputronik.pl/informacje/uslugi/wsparcie-komputronik/']");
        WebElement wsparcieKomputronik = driver.findElement(wsparcieKomputronikSelector);
        wsparcieKomputronik.click();


    }
}