package seldriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentWebCreatecont {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Gowtham");
		driver.findElement(By.id("lastNameField")).sendKeys("dev");
		driver.findElement(By.className("smallSubmit")).click();
		String text = driver.findElement(By.id("viewContact_fullName_sp")).getText();
		System.out.println("First name : "+text);
		String title = driver.getTitle();
		System.out.println(" Titile name : " + title);
		
		
	}

}
