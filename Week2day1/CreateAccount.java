package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
	
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
		
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("(//input[@id='accountName'])")).sendKeys("Debit Limited Account Devi");
		driver.findElement(By.xpath("(//textarea[@name='description'])")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("(//input[@name='groupNameLocal'])")).sendKeys("LC");
		driver.findElement(By.xpath("(//input[contains(@id,'office')])")).sendKeys("Office");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("5000");
		
		WebElement Ind = driver.findElement(By.name("industryEnumId"));
		Select idd = new Select(Ind);
		idd.selectByValue("IND_SOFTWARE");
		
		WebElement Own = driver.findElement(By.name("ownershipEnumId"));
		Select Odd = new Select(Own);
		Odd.selectByVisibleText("S-Corporation");
		
		WebElement Sou = driver.findElement(By.id("dataSourceId"));
		Select Sdd = new Select(Sou);
		Sdd.selectByValue("LEAD_EMPLOYEE");
		
		WebElement Mc = driver.findElement(By.name("marketingCampaignId"));
		Select Mdd = new Select(Mc);
		Mdd.selectByIndex(6);
		
		WebElement Sp = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select Spdd = new Select(Sp);
		Spdd.selectByValue("TX");
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
		
		
										
						
		
		
		

	}

}
