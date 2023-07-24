package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DC");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Devi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("G");
				
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(source);
		dd.selectByVisibleText("Employee");
		
		WebElement Ind = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select idd = new Select(Ind);
		idd.selectByValue("9001");
		
		WebElement Own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select odd = new Select(Own);
		odd.selectByIndex(5);

		WebElement Cou = driver.findElement(By.name("generalCountryGeoId"));
		Select cdd = new Select(Cou);
		cdd.selectByVisibleText("India");
		
		driver.findElement(By.className("smallSubmit")).click();
				
		String leadpage = driver.getTitle();
		System.out.println(leadpage);
		
		
	}

}
