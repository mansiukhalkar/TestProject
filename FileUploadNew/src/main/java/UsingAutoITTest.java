import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class UsingAutoITTest {
	@Test
	public void autoITUoload() throws InterruptedException, IOException {

		//chrome launch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 

		driver.get("file:///C:/Users/HP/Desktop/fileupload.html");
		System.out.println("1");
		//driver.findElement(By.id("1")).click();
		Actions actions = new Actions(driver);

		WebElement uploadPhotoBtn = driver.findElement(By.xpath("//input[@id='1']"));
		actions.moveToElement(uploadPhotoBtn).click().perform();

		System.out.println("2");
		Thread.sleep(5000);

		Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\AutoIT\\FileUploadd.exe");


	}

}
