package cucumber.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class BaseClass {
		public static WebDriver driver;
		public static Properties properties;

		public BaseClass() {

			try {
				properties = new Properties();
				FileInputStream fileInputStream = new FileInputStream(
						"D:\\New Selenium\\com.cucumber\\src\\main\\java\\cucucmber\\config\\config.properties");

				properties.load(fileInputStream);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		public static void launchBrowser() {

			System.setProperty("webdriver.chrome.driver", properties.getProperty("driverPath"));
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get(properties.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		}
	}
