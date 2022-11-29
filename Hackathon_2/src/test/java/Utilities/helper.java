package Utilities;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class helper {
	
	public static void initialization() {
	

	}
	public static helper Helper;
    public  static WebDriver driver;
    public final static int TIMEOUT = 2;
    //Logger log= Logger.getLogger(batchsteps.class);
     public helper()  {
        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();
      //  driver.get(" ");
        driver.manage().window().maximize();
    
    driver.quit();
        
       
     }
  
 
    public static void openPage(String url) {
        driver.get(url);
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void NavBack() {
    	driver.navigate().back();
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public static void setUpDriver() {
        if (Helper==null) {
            Helper = new helper();
        }
    }
     public static void tearDown() {
       /*  if(driver!=null) {
             driver.close();
             driver.quit();
         }
         Helper = null;}*/
    	 driver.close();
     }
}
	
	
	
	


