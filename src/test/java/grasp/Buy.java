package grasp;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.DogOnlinePage;

class Buy {
	static String dogNo;
	static String code;
	@DisplayName("购买辉煌ⅡTOP")
	@Test
	void hhTopBug() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		new HhLogin(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DogOnlinePage dPage = new DogOnlinePage(driver);
		dPage.productBuy().click();
		dPage.softDogBuy().click();
		dPage.hhTopSoft().click();
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("window.scrollTo(0,450);");
		dPage.hhTopFrame().click();
		dPage.hhTopNewBugRadio().click();
		dPage.hhTopSubmitBuyOrderButton().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dPage.confirmOrderButton().click();
		javascript.executeScript("window.scrollTo(0,450);");
		dPage.payPassword().sendKeys("123123");
		dPage.confirmPayButton().click();
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dPage.bugDogNumberAndCode().click();
		String text = driver.switchTo().alert().getText();
		Buy.dogNo = ((text.split("："))[2].split(" ")[0]);
		Buy.code = (text.split("："))[3];
		System.out.println(dogNo + ":" + code);
		driver.quit();
	}
}