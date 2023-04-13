import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
    @Test
    public void konfiguracjaTestByLink(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://komputronik.pl");

        By.ByCssSelector zgadzamSieNaWszystkie = new By.ByCssSelector("#onetrust-accept-btn-handler");
        driver.findElement(zgadzamSieNaWszystkie).click();




        By.ByCssSelector konfiguracjaKomputronikSelector = new By.ByCssSelector("a[href='https://www.komputronik.pl/informacje/uslugi/konfiguracja-personalizacja/']");
        WebElement konfiguracjaKomputronik = driver.findElement(konfiguracjaKomputronikSelector);
        konfiguracjaKomputronik.click();


    }

    @Test
    public void konfiguracjaTestBySelector(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://komputronik.pl");

        By.ByCssSelector zgadzamSieNaWszystkie = new By.ByCssSelector("#onetrust-accept-btn-handler");
        driver.findElement(zgadzamSieNaWszystkie).click();




        By.ByCssSelector konfiguracjaKomputronikSelector = new By.ByCssSelector("#width-parent > div:nth-child(5) > ktr-new-slider-with-scroll-transclude > div > div.relative > section > div > ol > li:nth-child(2) > div > a");
        WebElement konfiguracjaKomputronik = driver.findElement(konfiguracjaKomputronikSelector);
        konfiguracjaKomputronik.click();


    }


}
