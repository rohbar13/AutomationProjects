package selenium.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EaseMyTripDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();   //Launches a new browser window
		driver.manage().window().maximize();		//maximize the window size
		driver.get("https://www.easemytrip.com/");	//hit the url in opened window
		
		String pageTitle = driver.getTitle();		//Get the page title
		System.out.println(pageTitle);				//printing the title
		
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		Thread.sleep(5000);		
		driver.navigate().refresh();
		
		
		WebElement myAccounts = driver.findElement(By.id("spnMyAcc"));
		myAccounts.click();
		
		
		WebElement fromLocation = driver.findElement(By.id("FromSector_show"));
		fromLocation.clear();
		fromLocation.sendKeys("Delhi");
		
		
		
		Thread.sleep(10000);							//Hangs the execution for specific time in milliseconds
		driver.close();								//Closing the window
		
	}

}
