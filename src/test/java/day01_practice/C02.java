package day01_practice;

import io.netty.handler.codec.string.LineSeparator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        // arama motorunda nutella yazip aratınız
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("nutella");
        searchBox.submit();
        Thread.sleep(2000);

// Customer Service ve Registry butonlarına sırasıyla tıklayın ve title'larının "Amazon" icerdigini test edin
        for (int i = 0; i < 2; i++) {

            List<WebElement> cusRegButton = driver.findElements(By.xpath("(//a[@tabindex='0'])[6] | (//a[@tabindex='0'])[7]"));
            cusRegButton.get(i).click();
            Thread.sleep(2000);
            if (driver.getTitle().contains("Amazon")) {
                System.out.println("Test PASS");
            } else {
                System.out.println("Test FAIL");
            }
            driver.navigate().back();
            Thread.sleep(2000);
        }

// pencereyi kapatiniz
        driver.close();

    }
}
