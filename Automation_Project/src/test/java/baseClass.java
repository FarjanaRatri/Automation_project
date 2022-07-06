import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Happy Birthday");
	    //driver.findElement(By.xpath("(//8[text()= \"Gmail\"])[1]")).click();	
		driver.get("https://www.zoopla.co.uk");
		driver.findElement(By.xpath("(//*[@class='css-mx98y1-Text eczcs4p0'])[9]")).click();
		driver.findElement(By.id("//*[@id='input-email-address'] ")).sendKeys("ferdausi2830@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//*[text()='Sign in']")); 
		
	    //driver.get("https://youtube.com/");
		//driver.get("https://www.amazon.com");
				
		//driver.get("https://www.zoopla.co.uk/signin/?page_after_login={URL}&return_url={URL}/");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
				
				
		//What is the difference between fullscreen and maximize? 
		//cookies saves user history. We have to delete the cookies. Deleting cookies will remove user history.
				
		driver.navigate().to("https://www.facebook.com/"); //Navigate().to(""); do same thing as Get(""); but navigate method has more method option. like below...
		//driver.navigate().back(); // goes to backward click.
		//driver.navigate().forward(); //goes to forward click.
		//driver.navigate().refresh(); // refresh/ reload all the web elements. 
				
		//driver.get("https://www.zoopla.co.uk/signin/?page_after_login=%2F&return_url=%2F");
		//System.out.println(driver.getCurrentUrl()); // it will give me/ show me the  page URL result in console.
		//System.out.println(driver.getTitle());   //it will show me the page title in console.
		//System.out.println(" The title of the website:" + driver.getCurrentUrl());	
	
		
	}

}
