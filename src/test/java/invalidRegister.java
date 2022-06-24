import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class invalidRegister {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        case1();
        case2();
        case3();
        case4();
        case5();
        case6();
        case7();
        case8();
    }

    public static void case1() {
        driver.get("https://www.lcwaikiki.com/");
        driver.findElement(By.cssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"].header-dropdown-toggle")).click();
        driver.findElement(By.cssSelector("a.login-form__link")).click();
        driver.findElement(By.id("RegisterFormView_RegisterEmail")).sendKeys("!test@aa.");
        driver.findElement(By.id("RegisterForm")).click();
        WebElement wrn = driver.findElement(By.id("RegisterFormView_RegisterEmail-error"));
        String invalidMailWarning = wrn.getText();
        System.out.println("Warning: " + invalidMailWarning);
    }

    public static void case2() throws InterruptedException {
        driver.get("https://www.lcwaikiki.com/");
        driver.findElement(By.cssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"].header-dropdown-toggle")).click();
        driver.findElement(By.cssSelector("a.login-form__link")).click();
        driver.findElement(By.id("RegisterFormView_RegisterEmail")).sendKeys("emre.emre@hotmail.com");
        driver.findElement(By.id("RegisterForm")).click();
        Thread.sleep(1500);
        WebElement wrn = driver.findElement(By.id("RegisterFormView_RegisterEmail-error"));
        String invalidMailWarning = wrn.getText();
        System.out.println("Warning: " + invalidMailWarning);
    }

    public static void case3() throws InterruptedException {
        driver.get("https://www.lcwaikiki.com/");
        driver.findElement(By.cssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"].header-dropdown-toggle")).click();
        driver.findElement(By.cssSelector("a.login-form__link")).click();
        driver.findElement(By.id("RegisterFormView_RegisterEmail")).click();
        driver.findElement(By.id("RegisterForm")).click();
        Thread.sleep(1000);
        WebElement wrn = driver.findElement(By.id("RegisterFormView_RegisterEmail-error"));
        String invalidMailWarning = wrn.getText();
        System.out.println("Warning: " + invalidMailWarning);
    }

    public static void case4() throws InterruptedException {
        driver.get("https://www.lcwaikiki.com/");
        driver.findElement(By.cssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"].header-dropdown-toggle")).click();
        driver.findElement(By.cssSelector("a.login-form__link")).click();
        driver.findElement(By.id("RegisterFormView_Password")).sendKeys("x");
        driver.findElement(By.id("RegisterForm")).click();
        Thread.sleep(1000);
        WebElement wrn = driver.findElement(By.id("RegisterFormView_Password-error"));
        String invalidPasswordWarning = wrn.getText();
        System.out.println("Warning: " + invalidPasswordWarning);
    }

    public static void case5() throws InterruptedException {
        driver.get("https://www.lcwaikiki.com/");
        driver.findElement(By.cssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"].header-dropdown-toggle")).click();
        driver.findElement(By.cssSelector("a.login-form__link")).click();
        driver.findElement(By.id("RegisterFormView_Password")).sendKeys("1");
        driver.findElement(By.id("RegisterForm")).click();
        Thread.sleep(1000);
        WebElement wrn = driver.findElement(By.id("RegisterFormView_Password-error"));
        String invalidPasswordWarning = wrn.getText();
        System.out.println("Warning: " + invalidPasswordWarning);
    }

    public static void case6() throws InterruptedException {
        driver.get("https://www.lcwaikiki.com/");
        driver.findElement(By.cssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"].header-dropdown-toggle")).click();
        driver.findElement(By.cssSelector("a.login-form__link")).click();
        driver.findElement(By.id("RegisterFormView_Password")).sendKeys("x1");
        driver.findElement(By.id("RegisterForm")).click();
        Thread.sleep(1000);
        WebElement wrn = driver.findElement(By.id("RegisterFormView_Password-error"));
        String invalidPasswordWarning = wrn.getText();
        System.out.println("Warning: " + invalidPasswordWarning);
    }

    public static void case7() throws InterruptedException {
        driver.get("https://www.lcwaikiki.com/");
        driver.findElement(By.cssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"].header-dropdown-toggle")).click();
        driver.findElement(By.cssSelector("a.login-form__link")).click();
        driver.findElement(By.id("RegisterFormView_RegisterEmail")).click();
        driver.findElement(By.id("RegisterForm")).click();
        Thread.sleep(1000);
        WebElement wrn = driver.findElement(By.id("RegisterFormView_RegisterEmail-error"));
        String invalidPasswordWarning = wrn.getText();
        System.out.println("Warning: " + invalidPasswordWarning);
    }

    // There is a defect at the below case, that's why it will FAIL
    public static void case8() throws InterruptedException {
        driver.get("https://www.lcwaikiki.com/");
        driver.findElement(By.cssSelector("a[href=\"https://www.lcwaikiki.com/tr-TR/TR/giris\"].header-dropdown-toggle")).click();
        driver.findElement(By.cssSelector("a.login-form__link")).click();
        driver.findElement(By.id("RegisterFormView_Password")).sendKeys("1a!'^^+%&/()=?_.;>>|ü.çsiasdawqdsa");
        driver.findElement(By.id("RegisterForm")).click();
        Thread.sleep(1000);
        WebElement wrn = driver.findElement(By.id("RegisterFormView_Password-error"));
        String invalidPasswordWarning = wrn.getText();
        System.out.println("Warning: " + invalidPasswordWarning);
    }
}