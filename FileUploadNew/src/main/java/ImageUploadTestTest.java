import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImageUploadTestTest {
  @Test
  public void ImageUoloadOperation() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		String baseUrl = "http://demo.guru99.com/test/upload/";

		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys("C:\\Users\\HP\\Pictures\\csvss.png");

		// check the "I accept the terms of service" check box
		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button
		driver.findElement(By.name("send")).click();
		
		String ExpectedText ="1 file has been successfully uploaded.";
		String ActualText= driver.findElement(By.xpath("//*[@id=\"res\"]/center")).getText();
		if(ExpectedText.contains(ActualText)) {
			System.out.println("File uploaded ");
		}else {
			System.out.println("File not uploaded");
		}
  }
}
