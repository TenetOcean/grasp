package grasp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import page.CustomerPage;
import page.DogOnlinePage;
import page.RegisterPage;

public class YhhErpRegister {
	public static String dogNo;
	public static String code;
	public static WebDriver driver;

	public YhhErpRegister() {
		new YhhErpBuy();
		YhhErpRegister.dogNo = YhhErpBuy.dogNo;
		YhhErpRegister.code = YhhErpBuy.code;
		YhhErpRegister.driver = YhhErpBuy.driver;
		YhhErpRegister.driver.get("http://192.168.9.50:8500");
		RegisterPage rPage = new RegisterPage(YhhErpRegister.driver);
		DogOnlinePage dPage = new DogOnlinePage(YhhErpRegister.driver);
		rPage.RegisterDogNumber().sendKeys(YhhErpRegister.dogNo);
		rPage.RegisterCode().sendKeys(YhhErpRegister.code);
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
		YhhErpRegister.driver.switchTo().alert().accept();
		YhhErpRegister.driver.get("http://192.168.9.50:8200/Home/Index");
		dPage.dogManage().click();
		dPage.dogQuery().click();
		dPage.queryContent().sendKeys(YhhErpRegister.dogNo);
		dPage.queryButton().click();
		dPage.submitRegisterButton().click();
		dPage.registerPass().click();
		YhhErpRegister.driver.switchTo().alert().accept();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		YhhErpRegister.driver.switchTo().alert().accept();
		YhhErpRegister.driver.get("http://192.168.9.50:8300/");
		CustomerPage cPage = new CustomerPage(YhhErpRegister.driver);
		cPage.loginUserName().sendKeys("admin");
		cPage.loginPassWord().sendKeys("123123");
		cPage.loginUserCode().sendKeys("sdf3554kjs5d56afs55od54fj56o6565isg6577js");
		cPage.loginButton().click();
		cPage.registerExamine().click();
		cPage.waitRegisterExamine().click();
		cPage.waitRegisterSearch().sendKeys(YhhErpRegister.dogNo);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cPage.firstWaitRegisterContent().click();
		JavascriptExecutor js = (JavascriptExecutor) YhhErpRegister.driver;
		js.executeScript("window.scrollTo(0,450);");
		cPage.registerPassButton().click();
		cPage.submitButton().click();
	}
}