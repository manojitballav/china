package builds;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class spikart{
	static String originUrl = new String("https://www.flipkart.com/mi-5-white-32-gb/product-reviews/itmehxdspg3r3yz3?page=4&pid=MOBEHXDSTKP5ZYCP");
	//originUrl = "https://www.flipkart.com/mi-5-white-32-gb/product-reviews/itmehxdspg3r3yz3?page=4&pid=MOBEHXDSTKP5ZYCP";
	
    public static void main(String[] args) throws AWTException {
    	//public static string originUrl;
    	//String originUrl = "https://www.flipkart.com/mi-5-white-32-gb/product-reviews/itmehxdspg3r3yz3?page=4&pid=MOBEHXDSTKP5ZYCP";
        funcTionFordata();
    }

    public static void funcTionFordata() throws AWTException {
        //String originUrl = "https://www.flipkart.com/mi-5-white-32-gb/product-reviews/itmehxdspg3r3yz3?page=4&pid=MOBEHXDSTKP5ZYCP";
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Xiaomi\\Downloads\\Selenium\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        FirefoxDriver driver = new FirefoxDriver();
            driver.get(originUrl);
            driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
            for(int i=1;i<15;i++) {
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
            //Storing the next button in a variable
           WebElement nxtButton=driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div[16]/div[2]/a/span/span"));
           //Click function to proceed to the next page 
           nxtButton.click();
           funcTionFordata();
    }
}
