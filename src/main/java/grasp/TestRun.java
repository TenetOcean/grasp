package grasp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import page.CustomerPage;
import page.DogOnlinePage;

public class TestRun {
	public static void main(String[] args) throws InterruptedException {
		new HhTopRegister();
		System.out.println(HhTopRegister.dogNo);
		HhTopRegister.driver.quit();
		
		
		
		
		//打开新标签页，获取页面handle
		/*WebDriver driver = new ChromeDriver();
		new HhLogin(driver);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.open('http://192.168.9.50:8600/')");
		driver.get("http://192.168.9.50:8300/UpdateAudit/UpdateAudit");
		CustomerPage c = new CustomerPage(driver);
		ArrayList<String> tab = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(tab);
		Thread.sleep(2000);
		driver.switchTo().window(tab.get(1));*/
		
		
		//已注册云辉煌erp升级用户数
//		new YhhErpRegister();
//		YhhErpRegister.driver.get("http://192.168.9.50:8200/Home/Index");
//		DogOnlinePage d = new DogOnlinePage(YhhErpRegister.driver);
//		d.productUpdate().click();
//		d.productUpdateSubmodule().click();
//		d.updateDogNumber().sendKeys(YhhErpRegister.dogNo);
//		d.updateDogCode().sendKeys(YhhErpRegister.code);
//		d.isCrossProductUpdateCheakBox().click();
//		d.updateProductButton().click();
//		Thread.sleep(1000);
//		JavascriptExecutor js = (JavascriptExecutor) YhhErpRegister.driver;
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		d.yhhErpH3AddUpdateUsersButton().click();
//		d.submitUpdateOrderButton().click();
//		js.executeScript("document.getElementById('UpdateConfirmForm').submit();");
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		d.updateCompanyName().sendKeys("任我逍遥任我行");
//		d.updateSelectTrade().click();
//		d.updateSelectTradeList().click();
//		d.updateSelectProvince().click();
//		d.updateSelectProviceList().click();
//		d.updateAdress().sendKeys("软件园D");
//		d.updateContactName().sendKeys("小明");
//		d.updateMobileNumber().sendKeys("18280331234");
//		d.updatePhoneNumber().sendKeys("028803379");
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		d.updateCustomerEmail().sendKeys("120624697@qq.com");
//		d.updateCompanyLiaisonRadio().click();
//		d.updateChannelRadio().click();
//		d.updateIsWebsiteRadio().click();
//		d.updateIsNetworkRadio().click();
//		d.updateIsExistBranchsRadio().click();
//		d.updateComputerCountRadio().click();
//		d.updateSubmitExamineButton().click();
//		YhhErpRegister.driver.switchTo().alert().accept();
//		YhhErpRegister.driver.get("http://192.168.9.50:8300/UpdateAudit/UpdateAudit");
//		CustomerPage cPage = new CustomerPage(YhhErpRegister.driver);
//		cPage.updateExamine().click();
//		cPage.waitUpdateExamine().click();
//		cPage.searchInput().sendKeys(YhhErpRegister.dogNo);
//		Thread.sleep(2000);
//		cPage.firstWaitExamineContent().click();
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		cPage.examinePassButton().click();
//		cPage.submitButton().click();
//		YhhErpRegister.driver.get("http://192.168.9.50:8200");
//		d.productUpdate().click();
//		d.productWaitUpdateSubmodule().click();
//		d.waitUpdatePayButton().click();
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
//		d.payPassword().sendKeys("123123");
//		d.confirmPayButton().click();
//		YhhErpRegister.driver.switchTo().alert().accept();
		
		
//		d.payPassword().sendKeys("123123");
//		d.confirmPayButton().click();
	}
}

// 新购注册
/*
 * WebDriver driver = new ChromeDriver(); new HhLogin(driver);
 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * DogOnlinePage d = new DogOnlinePage(driver); d.productBuy().click();
 * d.softDogBuy().click(); d.yhhErpSoft().click(); d.yhhErpH3Frame().click();
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
 * d.yhhErpH3NewBugRadio().click();
 * d.customerName().sendKeys(RandomStringUtils.randomAlphabetic(3));
 * d.customerTel().sendKeys("15121014410");
 * d.yhhErpH3SubmitBuyOrderButton().click();
 * //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * d.confirmOrderButton().click();
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
 * d.payPassword().sendKeys("123123"); d.confirmPayButton().click();
 * driver.switchTo().alert().accept(); d.bugDogNumberAndCode().click(); String
 * text = driver.switchTo().alert().getText(); String dogNo =
 * ((text.split("："))[2].split(" ")[0]); String code = (text.split("："))[3];
 * System.out.println(dogNo + ":" + code); driver.switchTo().alert().dismiss();
 * driver.get("http://192.168.9.50:8500/");
 */

// 升级用户数
/*
 * d.productUpdate().click(); d.productUpdateSubmodule().click();
 * d.updateDogNumber().sendKeys("880397192307");
 * d.updateDogCode().sendKeys("0SCCHR23N2U0G2VE1TSBYR0MB4");
 * d.isCrossProductUpdateCheakBox().click(); d.updateProductButton().click();
 * Thread.sleep(1000); JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
 * d.addUpdateUsersButton().click(); d.submitUpdateOrderButton().click();
 * js.executeScript("document.getElementById('UpdateConfirmForm').submit();");
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
 * d.payPassword().sendKeys("123123"); d.confirmPayButton().click();
 */

/*
 * driver.findElement(By.cssSelector("#\\33 21")).click();
 * driver.findElement(By.cssSelector("#sidebar>ul>li:nth-child(5)>ul>li>a")).
 * click(); driver.findElement(By
 * .cssSelector("#bigbigbig > div > div:nth-child(1) > div.col-md-5.pull-right.text-right > div > input"
 * )) .sendKeys("881372343295"); driver.findElement( By.
 * cssSelector("#bigbigbig > div > div:nth-child(1) > div.col-md-5.pull-right.text-right > button"
 * )) .click(); driver.findElement(By.
 * cssSelector("#sample_1 > tbody.first > tr > td:nth-child(13) > button.btn.btn-success"
 * )) .click(); driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 * driver.findElement(By.cssSelector("#Through")).click();
 * driver.switchTo().alert().dismiss(); driver.get("http://192.168.9.50:8300/");
 * driver.manage().window().maximize(); CustomerPage cPage = new
 * CustomerPage(driver); cPage.loginUserName().sendKeys("admin");
 * cPage.loginPassWord().sendKeys("123123");
 * cPage.loginUserCode().sendKeys("sdf3554kjs5d56afs55od54fj56o6565isg6577js");
 * cPage.loginButton().click(); cPage.registerExamine().click();
 * cPage.waitRegisterExamine().click();
 * cPage.waitRegisterSearch().sendKeys("880557341260"); Thread.sleep(1000);
 * cPage.firstWaitRegisterContent().click(); JavascriptExecutor js =
 * (JavascriptExecutor) driver; js.executeScript("window.scrollTo(0,450);");
 * cPage.registerPassButton().click(); cPage.submitButton().click();
 */