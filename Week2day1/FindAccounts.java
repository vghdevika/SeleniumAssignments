package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccounts {

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
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");
		
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Credit Limited Account']")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		

		WebElement p = driver.findElement(By.xpath("(//input[@name='accountName'])[2]"));
		String s = p.getAttribute("value");
		System.out.println(s);
		
		if (s.equals("cCredit Limited Account")) {
			System.out.println ("The selected account is correct " + s);
		}else { 
			System.out.println ("The selected account is incorrect " + s);
		}
		
		WebElement e1 = driver.findElement(By.name("description"));
		System.out.println(e1.getText());
		
		String title1 = driver.getTitle();
		System.out.println(title1);

		if (title1.equals("cEdit Account | opentaps CRM")) {
			System.out.println ("The selected title is correct " + title1);
		}else { 
			System.out.println ("The selected title is incorrect " + title1);
		}

		

	}

}
