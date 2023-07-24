package Week1day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateandEditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
				
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Devi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
		driver.findElement(By.className("smallSubmit")).click();
		String leadpage = driver.getTitle();
		System.out.println(leadpage);
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("DC01");
		driver.findElement(By.className("smallSubmit")).click();
				
	}


	
	
}
