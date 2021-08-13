package grasp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.DogOnlinePage;

//辉煌ⅡTOP购买
public class HhTopBuy {
	public static String dogNo;
	public static String code;
	public static WebDriver driver;

	public HhTopBuy() {
		WebDriver driver = new ChromeDriver();
		HhTopBuy.driver = driver;
		new HhLogin(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DogOnlinePage d = new DogOnlinePage(driver);
		d.productBuy().click();
		d.softDogBuy().click();
		d.hhTopSoft().click();
		d.hhTopFrame().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.hhTopNewBugRadio().click();
		d.hhTopSubmitBuyOrderButton().click();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.confirmOrderButton().click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.payPassword().sendKeys("123123");
		d.confirmPayButton().click();
		driver.switchTo().alert().accept();
		d.bugDogNumberAndCode().click();
		String text = driver.switchTo().alert().getText();
		HhTopBuy.dogNo = ((text.split("："))[2].split(" ")[0]);
		HhTopBuy.code = (text.split("："))[3];
		driver.switchTo().alert().dismiss();
	}
}
