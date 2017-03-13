package builds;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class spikart{
    public static void main(String[] args) throws AWTException {
        spikart.funcTionFordata();
    }

    public static void funcTionFordata() throws AWTException {
        String originUrl = "https://www.flipkart.com/redmi-note-4-gold-32-gb/product-reviews/itmeqgs9gwrfwpf2?page=1&pid=MOBEQ98T82CYVHGZ";
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Xiaomi\\Downloads\\Selenium\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        FirefoxDriver driver = new FirefoxDriver();
            driver.get(originUrl);
            driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
            for(int i=1;i<10;i++) {
            	try{
				//Body of the review
				WebElement pathBody = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div["+i+"]/div/div/div[2]/div/div"));
				String body = pathBody.getText();
				System.out.println(body);
				//TimeStamp
				WebElement pathTime = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div["+i+"]/div/div/div[3]/div[1]/div/p[3]"));
				String time = pathTime.getText();
				System.out.println(time);
				//Adding an empty line
				System.out.println("\n");
				System.out.println("--------------------------------------------");
       }
        catch(Exception e ){
        	         }
            }
    }
}
