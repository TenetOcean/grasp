package grasp;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;

import page.CustomerPage;
import page.DogOnlinePage;

@DisplayName("升级测试")
class Update {

	// @Disabled
	@DisplayName("已注册云辉煌ERPH3买断升级")
	@Test
	void registeredYhhUpdate() throws InterruptedException {
		new YhhErpRegister();
		YhhErpRegister.driver.get("http://192.168.9.50:8200/Home/Index");
		DogOnlinePage d = new DogOnlinePage(YhhErpRegister.driver);
		d.productUpdate().click();
		d.productUpdateSubmodule().click();
		d.updateDogNumber().sendKeys(YhhErpRegister.dogNo);
		d.updateDogCode().sendKeys(YhhErpRegister.code);
		d.isCrossProductUpdateCheakBox().click();
		d.updateProductButton().click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) YhhErpRegister.driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.yhhErpH3AddUpdateUsersButton().click();
		d.submitUpdateOrderButton().click();
		js.executeScript("document.getElementById('UpdateConfirmForm').submit();");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.updateCompanyName().sendKeys("任我逍遥任我行");
		d.updateSelectTrade().click();
		d.updateSelectTradeList().click();
		d.updateSelectProvince().click();
		d.updateSelectProviceList().click();
		d.updateAdress().sendKeys("软件园D");
		d.updateContactName().sendKeys("小明");
		d.updateMobileNumber().sendKeys("18280331234");
		d.updatePhoneNumber().sendKeys("028803379");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.updateCustomerEmail().sendKeys("120624697@qq.com");
		d.updateCompanyLiaisonRadio().click();
		d.updateChannelRadio().click();
		d.updateIsWebsiteRadio().click();
		d.updateIsNetworkRadio().click();
		d.updateIsExistBranchsRadio().click();
		d.updateComputerCountRadio().click();
		d.updateSubmitExamineButton().click();
		YhhErpRegister.driver.switchTo().alert().accept();
		YhhErpRegister.driver.get("http://192.168.9.50:8300/UpdateAudit/UpdateAudit");
		CustomerPage cPage = new CustomerPage(YhhErpRegister.driver);
		cPage.updateExamine().click();
		cPage.waitUpdateExamine().click();
		cPage.searchInput().sendKeys(YhhErpRegister.dogNo);
		Thread.sleep(2000);
		cPage.firstWaitExamineContent().click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		cPage.examinePassButton().click();
		cPage.submitButton().click();
		YhhErpRegister.driver.get("http://192.168.9.50:8200");
		d.productUpdate().click();
		d.productWaitUpdateSubmodule().click();
		d.waitUpdatePayButton().click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.payPassword().sendKeys("123123");
		d.confirmPayButton().click();
		YhhErpRegister.driver.switchTo().alert().accept();
		System.out.println(YhhErpRegister.dogNo);
		YhhErpRegister.driver.quit();
	}

	// @Disabled
	@DisplayName("未注册云辉煌ERPH3买断升级")
	@Test
	void unregisteredYhhUpdate() throws InterruptedException {
		new YhhErpBuy();
		YhhErpBuy.driver.get("http://192.168.9.50:8200/Home/Index");
		DogOnlinePage d = new DogOnlinePage(YhhErpBuy.driver);
		d.productUpdate().click();
		d.productUpdateSubmodule().click();
		d.updateDogNumber().sendKeys(YhhErpBuy.dogNo);
		d.updateDogCode().sendKeys(YhhErpBuy.code);
		d.isCrossProductUpdateCheakBox().click();
		d.updateProductButton().click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) YhhErpBuy.driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.yhhErpH3AddUpdateUsersButton().click();
		d.submitUpdateOrderButton().click();
		js.executeScript("document.getElementById('UpdateConfirmForm').submit();");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.payPassword().sendKeys("123123");
		d.confirmPayButton().click();
		YhhErpBuy.driver.switchTo().alert().accept();
		System.out.println(YhhErpBuy.dogNo);
		YhhErpBuy.driver.quit();
	}

	// @Disabled
	@DisplayName("未注册辉煌ⅡTOP升级")
	@Test
	void unregisteredHhTopUpdate() throws InterruptedException {
		new HhTopBuy();
		HhTopBuy.driver.get("http://192.168.9.50:8200/Home/Index");
		DogOnlinePage d = new DogOnlinePage(HhTopBuy.driver);
		d.productUpdate().click();
		d.productUpdateSubmodule().click();
		d.updateDogNumber().sendKeys(HhTopBuy.dogNo);
		d.updateDogCode().sendKeys(HhTopBuy.code);
		d.isCrossProductUpdateCheakBox().click();
		d.updateProductButton().click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) HhTopBuy.driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.hhTopAddUpdateUsersButton().click();
		d.submitUpdateOrderButton().click();
		js.executeScript("document.getElementById('UpdateConfirmForm').submit();");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.payPassword().sendKeys("123123");
		d.confirmPayButton().click();
		HhTopBuy.driver.switchTo().alert().accept();
		System.out.println(HhTopBuy.dogNo);
		HhTopBuy.driver.quit();
	}

	// @Disabled
	@DisplayName("已注册辉煌ⅡTOP升级")
	@Test
	void registeredHhTopUpdate() throws InterruptedException {
		new HhTopRegister();
		HhTopRegister.driver.get("http://192.168.9.50:8200/Home/Index");
		DogOnlinePage d = new DogOnlinePage(HhTopRegister.driver);
		d.productUpdate().click();
		d.productUpdateSubmodule().click();
		d.updateDogNumber().sendKeys(HhTopRegister.dogNo);
		d.updateDogCode().sendKeys(HhTopRegister.code);
		d.isCrossProductUpdateCheakBox().click();
		d.updateProductButton().click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) HhTopRegister.driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.hhTopAddUpdateUsersButton().click();
		d.submitUpdateOrderButton().click();
		js.executeScript("document.getElementById('UpdateConfirmForm').submit();");
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.updateCompanyName().sendKeys("任我逍遥任我行");
		d.updateSelectTrade().click();
		d.updateSelectTradeList().click();
		d.updateSelectProvince().click();
		d.updateSelectProviceList().click();
		d.updateAdress().sendKeys("软件园D");
		d.updateContactName().sendKeys("小明");
		d.updateMobileNumber().sendKeys("18280331234");
		d.updatePhoneNumber().sendKeys("028803379");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.updateCustomerEmail().sendKeys("120624697@qq.com");
		d.updateCompanyLiaisonRadio().click();
		d.updateChannelRadio().click();
		d.updateIsWebsiteRadio().click();
		d.updateIsNetworkRadio().click();
		d.updateIsExistBranchsRadio().click();
		d.updateComputerCountRadio().click();
		d.updateSubmitExamineButton().click();
		HhTopRegister.driver.switchTo().alert().accept();
		HhTopRegister.driver.get("http://192.168.9.50:8300/UpdateAudit/UpdateAudit");
		CustomerPage cPage = new CustomerPage(HhTopRegister.driver);
		cPage.updateExamine().click();
		cPage.waitUpdateExamine().click();
		cPage.searchInput().sendKeys(HhTopRegister.dogNo);
		Thread.sleep(2000);
		cPage.firstWaitExamineContent().click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		cPage.examinePassButton().click();
		cPage.submitButton().click();
		HhTopRegister.driver.get("http://192.168.9.50:8200");
		d.productUpdate().click();
		d.productWaitUpdateSubmodule().click();
		d.waitUpdatePayButton().click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.payPassword().sendKeys("123123");
		d.confirmPayButton().click();
		HhTopRegister.driver.switchTo().alert().accept();
		System.out.println(HhTopRegister.dogNo);
		HhTopRegister.driver.quit();
	}

	// @Disabled
	@DisplayName("未注册辉煌Top升级到云辉煌ERP H3买断")
	@Test
	void unregisteredHhTopUpdateToYhh() throws InterruptedException {
		new HhTopBuy();
		DogOnlinePage d = new DogOnlinePage(HhTopBuy.driver);
		HhTopBuy.driver.get("http://192.168.9.50:8200/Home/Index");
		d.productUpdate().click();
		d.productUpdateSubmodule().click();
		d.updateDogNumber().sendKeys(HhTopBuy.dogNo);
		d.updateDogCode().sendKeys(HhTopBuy.code);
		d.isCrossProductUpdateCheakBox().click();
		d.updateProductButton().click();
		d.yhhErpSoftInUpdate().click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) HhTopBuy.driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.yhhErpH3FrameInUpdate().click();
		d.yhhErpH3AddUpdateUsersButton().click();
		d.updateCustomerName().sendKeys(RandomStringUtils.randomAlphabetic(3));
		d.updateCustomerTel().sendKeys("18421410474");
		d.submitUpdateOrderButton().click();
		HhTopBuy.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		js.executeScript("document.getElementById('UpdateConfirmForm').submit();");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		d.payPassword().sendKeys("123123");
		d.confirmPayButton().click();
		HhTopBuy.driver.switchTo().alert().accept();
		System.out.println(HhTopBuy.dogNo);
		HhTopBuy.driver.quit();
	}
}