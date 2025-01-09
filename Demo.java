package pack1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://omayo.blogspot.com/");
//		driver.findElement(By.linkText("Open a popup window")).click();
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> itr = windows.iterator();
//		String parent = itr.next();
//		String child = itr.next();
//		driver.switchTo().window(child);
//		System.out.println(driver.findElement(By.className("example")).getText());
//		driver.quit();
//	driver.manage().window().maximize();
//	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
//    Set<String> windows = driver.getWindowHandles();
//    Iterator<String> itr = windows.iterator();
//    String parent = itr.next();
//    String child = itr.next();
//    driver.switchTo().window(child);
//    System.out.println(driver.findElement(By.id("Header1_headerimg")).getText());
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.manage().window().maximize();
//		driver.get("https://omayo.blogspot.com/");
//		driver.findElement(By.className("dropbtn")).click();
//		driver.findElement(By.linkText("Flipkart")).click();
//		driver.quit();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
//	    driver.manage().window().maximize();
//        driver.get("https://omayo.blogspot.com/");
//        driver.findElement(By.className("dropbtn")).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook"))).click();
//        //driver.findElement(By.linkText("Facebook")).click();
//		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(3));
//		driver.manage().window().maximize();
//    	 driver.get("https://omayo.blogspot.com/");
//    	 driver.findElement(By.className("dropbtn")).click();
//    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail"))).click();		
//        driver.quit();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://omayo.blogspot.com/");
//		driver.findElement(By.id("alert1")).click();
//		Alert alert = driver.switchTo().alert();
//	System.out.println(alert.getText());	
//
//		alert.accept();
//	driver.findElement(By.id("prompt")).click();
//	Alert alert = driver.switchTo().alert();
//	Thread.sleep(3000);
//	driver.findElement(By.id("prompt")).sendKeys("udayasree");
//	Thread.sleep(3000);
//	
//	alert.accept();
	
    driver.manage().window().maximize();
    driver.get("https://candymapper.com/");
    driver.findElement(By.xpath("//div[@class=\"x-el x-el-div c1-1 c1-2 c1-r c1-48 c1-5g c1-5h c1-5e c1-12 c1-u c1-f9 c1-b2 c1-b c1-c c1-d c1-e c1-f c1-g\"]")).click();
    driver.findElement(By.linkText("JOIN US")).click();
    driver.findElement(By.linkText("Create account.")).click();
    driver.findElement(By.name("nameFirst")).sendKeys("udaya");
    driver.findElement(By.name("nameLast")).sendKeys("sree");
    driver.findElement(By.name("email")).sendKeys("annavaram.udayasree@gmail.com");
    driver.findElement(By.name("phone")).sendKeys("990033667788");
    driver.findElement(By.xpath("//button[text()=\"Create Account\"]")).click();
    Thread.sleep(3000);
//    driver.close();
    }
	

}
