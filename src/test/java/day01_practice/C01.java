package day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        Thread.sleep(2000);

        // ilk kutucuga 20 giriniz
        WebElement ilkKutu = driver.findElement(By.xpath("//*[@id='number1']"));
        ilkKutu.sendKeys("20");
        Thread.sleep(2000);

        // ikinci kutucuga 30 giriniz
        WebElement ikinciKutu = driver.findElement(By.xpath("//*[@id='number2']"));
        ikinciKutu.sendKeys("30");
        Thread.sleep(2000);

        // calculate'e tıklayınız
        driver.findElement(By.xpath("//*[@id='calculate']")).click();
        Thread.sleep(2000);

        // sonucu yazdırınız
        WebElement sonuc = driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println("sonuc: "+sonuc.getText());

        // sayfayi kapatiniz
        driver.close();
    }
}
