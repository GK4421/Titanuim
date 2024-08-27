import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void launchBrowserAndLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.evershop.io");
        driver.findElement(By.xpath("//a[@href ='/account/login']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gunjesh09@outlook.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vickey@99");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
        driver.quit();

    }




}
