import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","C:/Users/ayush/Downloads/Compressed/chromedriver_win32/chromedriver.exe" );

        driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://olympus.greatlearning.in/login");

        WebElement username=driver.findElement(By.id("login"));
        WebElement password=driver.findElement(By.id("password"));

        username.sendKeys("ayush.kumar@knol.com");
        password.sendKeys("Knol35@");

        WebElement login = driver.findElement(By.id("reCaptchaLoginSubmitButton"));

        driver.findElement(By.id("reCaptchaLoginSubmitButton")).submit();

        driver.quit();
    }

}
