package mobiletesting.Automation_mobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class App 
{
	static AppiumDriver driver;
    public static void main( String[] args ) throws Exception
    {
    
    	DesiredCapabilities cap = new DesiredCapabilities();
    	cap.setCapability("deviceName","onePlus7");
    	cap.setCapability("udid","46595954ab");
    	cap.setCapability("platformName","Android");
    	cap.setCapability("appPackage", "com.myos.calculator2");
    	cap.setCapability("appactivity", "com.myos.calculator2.Calculator");
    	URL url = new URL("http://127.0.0.1:4723/wd/hub");
      	driver = new AppiumDriver<MobileElement>(url,cap);
      	MobileElement one = (MobileElement) driver.findElement(By.id("com.myos.calculator2.Calculator2:id/digit1"));
      	one.click();
     	MobileElement plus = (MobileElement) driver.findElement(By.id("com.myos.calculator2.Calculator2:id/plus"));
    	MobileElement two = (MobileElement) driver.findElement(By.id("com.myos.calculator2.Calculator2:id/digit2"));
    	two.click();
    	MobileElement equals = (MobileElement) driver.findElement(By.id("com.myos.calculator2.Calculator2:id/equal"));
    	equals.click();
    	MobileElement result = (MobileElement) driver.findElement(By.className("android.widget.EditText"));
    	result.getText();
    	String res = result.getText();
    	System.out.println(res);
    	
      	
      	
 
    	
    	
    	
    	
        //System.out.println( "Hello World!" );
    }
}
