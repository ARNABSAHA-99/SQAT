package Test_Script;

//import required packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// Set the path of Executable browser driver
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //Parent p = new child (WebDriver is parent and Chrome driver is child))
        
		driver.get("http://localhost/Web%20Tech%20Project%20Doctor/login2.php"); //opening url
		driver.findElement(By.id("doctor")).sendKeys("Doctor"); 
		//login module's doctor category field id
		driver.findElement(By.id("name")).sendKeys("John Kabir"); 
		//login module's username field id
		driver.findElement(By.id("password")).sendKeys("john1234@");
		//login module's password field id
		driver.findElement(By.xpath("/html/body/div/div/div/form/div/input[4]")).click();
		//login module's submit button's xpath
		System.out.println("Test Successful"); //Print that text after successsful code execution
		driver.quit(); //closing browser
		
	}

}
	