	package shopping_website;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	
	public class shopping_LUMA {
	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/");
	driver.findElement(By.linkText("Sign In")).click();
	driver.findElement(By.id("email")).sendKeys("Mastermind@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Abc@12345");
	driver.findElement(By.id("send2")).click();
	String text = driver.findElement(By.className("base")).getText();
	System.out.println(text);	
	driver.findElement(By.xpath("//span[text()=\"Women\"]")).click();
	driver.findElement(By.linkText("Tops")).click();
	driver.findElement(By.xpath("(//img[@class=\"product-image-photo\"])[2]")).click();
	driver.findElement(By.xpath("//div[@id=\"option-label-size-143-item-169\"]")).click();
	driver.findElement(By.xpath("//div[@id=\"option-label-color-93-item-57\"]")).click();
	driver.findElement(By.xpath("//span[text()=\"Add to Cart\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class=\"counter-number\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id=\"top-cart-btn-checkout\"]")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("street[0]")).sendKeys("E-city");
	driver.findElement(By.name("city")).sendKeys("Bengaluru");
	driver.findElement(By.name("postcode")).sendKeys("12345-6789");
	driver.findElement(By.name("telephone")).sendKeys("990033889955");
	WebElement drop = driver.findElement(By.name("region_id"));
	Select select=new Select(drop);
	select.selectByVisibleText("Alaska");
	WebElement drop1 = driver.findElement(By.name("country_id"));
	Select select1=new Select(drop1);
	select1.selectByVisibleText("United States");
	//driver.findElement(By.xpath("(//input[@class=\"radio\"])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
	driver.findElement(By.xpath("//span[text()=\"Place Order\"]")).click();
	Thread.sleep(3000);
	
	driver.close();
		}
	
	}
