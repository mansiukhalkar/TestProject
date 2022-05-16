import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FileUploadUsingSendKeysTestTest {
  @Test
  public void UploadFile() {
	//chrome launch
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 

		String BaseUrl = "https://www.monsterindia.com/seeker/registration";
		
		//open url
		driver.get(BaseUrl);
		
		WebElement browse = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		//clicking on Choose file to upload the file
		//Uploading the file using sendKeys
		browse.sendKeys("C:\\Users\\HP\\Documents\\today.txt"); 
		
		System.out.println("File uploaded successfully");
  }
  @AfterClass
  public void afterClass() throws InterruptedException {
	ChromeDriver chromeDriver = new ChromeDriver();
	Thread.sleep(3000);
	chromeDriver.close();
  }

}
