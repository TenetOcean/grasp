package grasp;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.CustomerPage;
import page.DogOnlinePage;
import page.RegisterPage;

class Register {

	@DisplayName("辉煌ⅡTOP产品注册")
	@Test
	void hhTopRegister() {
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
		String dogNo = ((text.split("："))[2].split(" ")[0]);
		String code = (text.split("："))[3];
		driver.switchTo().alert().dismiss();
		driver.get("http://192.168.9.50:8500");
		RegisterPage rPage = new RegisterPage(driver);
		driver.manage().window().maximize();
		rPage.RegisterDogNumber().sendKeys(dogNo);
		rPage.RegisterCode().sendKeys(code);
		rPage.submitButton().click();
		rPage.agentName().sendKeys("五五");
		rPage.contactName().sendKeys("小明");
		rPage.customerEmail().sendKeys("120624697@qq.com");
		rPage.companyName().sendKeys("任我逍遥任我行");
		rPage.adress().sendKeys("软件园D");
		rPage.selectTrade().click();
		rPage.selectTradeList().click();
		rPage.selectProvince().click();
		rPage.selectProviceList().click();
		rPage.mobileNumber().sendKeys("18280331234");
		rPage.phoneNumber().sendKeys("028803379");
		rPage.companyLiaisonRadio().click();
		rPage.channelRadio().click();
		rPage.isWebsiteRadio().click();
		rPage.isNetworkRadio().click();
		rPage.isExistBranchsRadio().click();
		rPage.computerCountRadio().click();
		rPage.submitRegisterButton().click();
		driver.switchTo().alert().accept();
		driver.get("http://192.168.9.50:8200/Home/Index");
		dPage.dogManage().click();
		dPage.dogQuery().click();
		dPage.queryContent().sendKeys(dogNo);
		dPage.queryButton().click();
		dPage.submitRegisterButton().click();
		dPage.registerPass().click();
		driver.switchTo().alert().accept();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
		driver.get("http://192.168.9.50:8300/");
		CustomerPage cPage = new CustomerPage(driver);
		cPage.loginUserName().sendKeys("admin");
		cPage.loginPassWord().sendKeys("123123");
		cPage.loginUserCode().sendKeys("sdf3554kjs5d56afs55od54fj56o6565isg6577js");
		cPage.loginButton().click();
		cPage.registerExamine().click();
		cPage.waitRegisterExamine().click();
		cPage.waitRegisterSearch().sendKeys(dogNo);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cPage.firstWaitRegisterContent().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,450);");
		cPage.registerPassButton().click();
		cPage.submitButton().click();
		System.out.println(dogNo);
		driver.quit();
	}
}
