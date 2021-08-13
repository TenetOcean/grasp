package grasp;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.DogOnlinePage;

public class YhhErpBuy {
	public static String dogNo;
	public static String code;
	public static WebDriver driver;
	
	public YhhErpBuy() {
		WebDriver driver = new ChromeDriver();
		YhhErpBuy.driver = driver;
		new HhLogin(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DogOnlinePage d = new DogOnlinePage(driver);
		d.productBuy().click();
		d.softDogBuy().click();
		d.yhhErpSoft().click();
		d.yhhErpH3Frame().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.yhhErpH3NewBugRadio().click();
		d.customerName().sendKeys(RandomStringUtils.randomAlphabetic(4));
		d.customerTel().sendKeys("15121014410");
		d.yhhErpH3SubmitBuyOrderButton().click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.confirmOrderButton().click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.payPassword().sendKeys("123123");
		d.confirmPayButton().click();
		driver.switchTo().alert().accept();
		d.bugDogNumberAndCode().click();
		String text = driver.switchTo().alert().getText();
		YhhErpBuy.dogNo = ((text.split("："))[2].split(" ")[0]);
		YhhErpBuy.code = (text.split("："))[3];
		driver.switchTo().alert().dismiss();
	}
}
