package builds;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class redmi{
    public static void main(String[] args) throws AWTException {
        Flip.funcTionFordata();
    }

    public static void funcTionFordata() throws AWTException {
        String originUrl = "https://www.flipkart.com/redmi-note-4-gold-32-gb/product-reviews/itmeqgs9gwrfwpf2?page=";
        String dateInQuestion = originUrl;
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Xiaomi\\Downloads\\Selenium\\geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        FirefoxDriver driver = new FirefoxDriver();
        for(int j=1;j<=50;j++) {
            dateInQuestion = String.valueOf(dateInQuestion)+j+"&pid=MOBEQ98T82CYVHGZ";
            //System.out.println(dateInQuestion);
            driver.get(dateInQuestion);
            driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
            for(int i=1;i<10;i++) {
            	try{
            	
            	
            	//Title part
				/*WebElement pathTitle = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div["+i+"]/div/div/div[1]/p"));
				String title=pathTitle.getText();
				System.out.println(title);*/
				//Rating Part
				/*WebElement pathRating = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div["+i+"]/div/div/div[1]/div"));
				String rating = pathRating.getText();
				System.out.println(rating);*/
				//Body of the review
				WebElement pathBody = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div["+i+"]/div/div/div[2]/div/div"));
				String body = pathBody.getText();
				System.out.println(body);
				//Views of the upVotes
				/*WebElement pathUpvotes = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div["+i+"]/div/div/div[3]/div[2]/div/div[1]/div[1]/span"));
				String upvotes = pathUpvotes.getText();
				System.out.println(upvotes);*/
				//Views of the downVotes
				/*WebElement pathDownvotes = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div["+i+"]/div/div/div[3]/div[2]/div/div[1]/div[2]/span"));
				String downvotes = pathDownvotes.getText();
				System.out.println(downvotes);*/
				//TimeStamp
				WebElement pathTime = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div/div/div[2]/div[2]/div[2]/div["+i+"]/div/div/div[3]/div[1]/div/p[3]"));
				String time = pathTime.getText();
				System.out.println(time);
				
				//Adding an empty line
				System.out.println("\n");
            
            System.out.println("End of page :" + j);
            System.out.println("---------------------------------");
            dateInQuestion = originUrl;
        }
        
        catch(Exception e ){
        	         }
            }
        }
    }
}

