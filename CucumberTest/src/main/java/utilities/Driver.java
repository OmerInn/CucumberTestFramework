package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    @Before
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Ekranı tam ekran yap
        driver.manage().window().maximize();

        // Diğer ayarlar (timeout, sayfa yüklenme bekleme süresi, vs.) eklenebilir.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // WebDriver'ı ThreadLocal değişkenine atayın
        driverThreadLocal.set(driver);
    }

    public static WebDriver getDriver() {
        if (driverThreadLocal.get() == null) {
            WebDriverManager.chromedriver().setup();
            driverThreadLocal.set(new ChromeDriver());
        }
        return driverThreadLocal.get();
    }

    // Diğer metotlar...

    @After
    public static void quitDriver() {
        if (driverThreadLocal.get() != null) {
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }

}

