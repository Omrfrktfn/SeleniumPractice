package day01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        // "https://www.ebay.pl/" adresine gidiniz.
        driver.navigate().to("https://www.ebay.pl/");
        Thread.sleep(2000);

        // amazon adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(2000);

        // https://www.ebay.pl/ adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);

        // sayfayi yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);

        // pencereyi kapat
        driver.quit();

        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("HER SEY YOLUNDA");

    }
}
