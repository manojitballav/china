package builds;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver; //not required since, the path is set manually on line 19
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class spikart{
	//Initializing the URL
	static String originUrl = new String("https://www.flipkart.com/mi-5-white-32-gb/product-reviews/itmehxdspg3r3yz3?page=4&pid=MOBEHXDSTKP5ZYCP");
	
    public static void main(String[] args) throws AWTException {
        funcTionFordata();
    }
    //This function gets the data
    public static void funcTionFordata() throws AWTException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Xiaomi\\Downloads\\Selenium\\geckodriver.exe"); //path to the web driver
        DesiredCapabilities capabilities = DesiredCapabilities.firefox(); //Setting firefox capabilities 
        capabilities.setCapability("marionette", true); //setting the capability if marionette driver
        FirefoxDriver driver = new FirefoxDriver(); //This starts a new firefox window
            driver.get(originUrl); //Pushes the url to the new window
            driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS); //setting the maximum timeout
            for(int i=1;i<15;i++) {
            	try{
				//Body of the review
            		//Storing the html content in the  variable
				WebElement pathBody = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div["+i+"]/div/div/div[2]/div/div"));
				String body = pathBody.getText(); //getting only the text from the html content
				System.out.println(body); //printing the text part
				//TimeStamp
					//storing the date of the review
				WebElement pathTime = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div["+i+"]/div/div/div[3]/div[1]/div/p[3]"));
				String time = pathTime.getText(); //getting the text of the html content
				System.out.println(time); //printing out the date from the html content
				//Adding an empty line
				System.out.println("\n"); //to give a line gap
				System.out.println("--------------------------------------------"); //to mark the end of a review
       }
        catch(Exception e ){
        	         }
            }
            //Storing the next button in a variable
           WebElement nxtButton=driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div[16]/div[2]/a/span/span"));
           //Click function to proceed to the next page 
           nxtButton.click();
           //calling the function again to scrap the next page
           funcTionFordata();
    }
}
