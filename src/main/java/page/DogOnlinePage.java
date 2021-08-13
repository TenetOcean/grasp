package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//软狗在线销售系统页面元素
public class DogOnlinePage {
	static WebDriver driver;

	public DogOnlinePage(WebDriver driver) {
		DogOnlinePage.driver = driver;
	}

	// 产品购买模块
	public WebElement productBuy() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#\\31 01"));
	}

	// 软狗产品购买子模块
	public WebElement softDogBuy() {
		return DogOnlinePage.driver
				.findElement(By.cssSelector("#sidebar > ul > li.sub-menu.open > ul > li:nth-child(1)"));
	}

	// 管家婆辉煌ⅡTOP软件
	public WebElement hhTopSoft() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#pills > ul > li:nth-child(4)"));
	}

	// 辉煌ⅡTOP选中框
	public WebElement hhTopFrame() {
		return DogOnlinePage.driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[6]/form/div[1]/div[1]/a"));
	}

	// 辉煌ⅡTOP单选按钮'新购'
	public WebElement hhTopNewBugRadio() {
		return DogOnlinePage.driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[6]/form/div[2]/div[3]/div/div/label[1]/input"));
	}

	// 辉煌ⅡTOP提交订单按钮
	public WebElement hhTopSubmitBuyOrderButton() {
		return DogOnlinePage.driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[6]/form/div[2]/div[14]/div/button[1]"));
	}

	// 管家婆云辉煌ERP
	public WebElement yhhErpSoft() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#pills > ul > li:nth-child(5)"));
	}

	// 云辉煌ERP H3买断选中框
	public WebElement yhhErpH3Frame() {
		return DogOnlinePage.driver
				.findElement(By.cssSelector("#pills-tab11504 > form > div.row > div:nth-child(2) > a"));
	}

	// 云辉煌ERP H3买断单选按钮'新购'
	public WebElement yhhErpH3NewBugRadio() {
		return DogOnlinePage.driver.findElement(By.cssSelector(
				"#pills-tab11504 > form > div.top-line > div:nth-child(3) > div > div > label:nth-child(1) > input "));
	}

	// 客户名称输入框
	public WebElement customerName() {
		return DogOnlinePage.driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[7]/form/div[2]/div[10]/div/input"));
	}

	// 客户电话输入框
	public WebElement customerTel() {
		return DogOnlinePage.driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[7]/form/div[2]/div[11]/div/input"));
	}

	// 云辉煌ERP H3买断提交订单按钮
	public WebElement yhhErpH3SubmitBuyOrderButton() {
		return DogOnlinePage.driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div[2]/div[7]/form/div[2]/div[14]/div/button[1]"));
	}

	// 购买成功验证码狗号弹出框
	public WebElement bugDogNumberAndCode() {
		return DogOnlinePage.driver
				.findElement(By.xpath("//*[@id=\"modalId\"]/div[1]/div/div[2]/div/div[3]/div/input[1]"));
	}

	// 产品升级模块
	public WebElement productUpdate() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#\\32 01"));
	}

	// 产品升级子模块
	public WebElement productUpdateSubmodule() {
		return DogOnlinePage.driver
				.findElement(By.cssSelector("#sidebar > ul > li.sub-menu.open > ul > li:nth-child(1)"));
	}

	// 升级狗号输入框
	public WebElement updateDogNumber() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#DogNo"));
	}

	// 升级狗号验证码输入框
	public WebElement updateDogCode() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#VerificaCode"));
	}

	// 是否跨产品升级勾选框
	public WebElement isCrossProductUpdateCheakBox() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#IsCrossProduct"));
	}

	// 升级产品按钮
	public WebElement updateProductButton() {
		return DogOnlinePage.driver
				.findElement(By.cssSelector("#UpdateBuyForm > div:nth-child(4) > div > button.btn.btn-success"));
	}

	// 辉煌ⅡTop升级云辉煌ERP
	public WebElement yhhErpSoftInUpdate() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#pills > ul > li:nth-child(4)"));
	}

	// 辉煌ⅡTop升级云辉煌ERP H3买断选中框
	public WebElement yhhErpH3FrameInUpdate() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#YHHERPH3MD_TY"));
	}

	// 辉煌ⅡTop升级用户数增加按钮
	public WebElement hhTopAddUpdateUsersButton() {
		return DogOnlinePage.driver
				.findElement(By.cssSelector("#pills-tab297 > div.row > div:nth-child(1) > div > button:nth-child(3)"));
	}

	// 云辉煌ERP H3买断升级用户数增加按钮
	public WebElement yhhErpH3AddUpdateUsersButton() {
		return DogOnlinePage.driver
				.findElement(By.cssSelector("#pills-tab365 > div.row > div:nth-child(1) > div > button:nth-child(3)"));
	}

	// 辉煌ⅡTop升级云辉煌ERP H3买断升级客户名称输入框
	public WebElement updateCustomerName() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#CustomerName"));
	}

	// 辉煌ⅡTop升级云辉煌ERP H3买断升级客户电话输入框
	public WebElement updateCustomerTel() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#CustomerTel"));
	}

	// 升级确认提交按钮
	public WebElement submitUpdateOrderButton() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#UpdateBuy"));
	}

	// 确认订单按钮
	public WebElement confirmOrderButton() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='formsubmit']"));
	}

	// 升级客户公司名称输入框
	public WebElement updateCompanyName() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#CompanyName"));
	}

	// 升级所属行业下拉框
	public WebElement updateSelectTrade() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='IndustryID_chzn']"));
	}

	// 升级所属行业下拉‘IT业’一列
	public WebElement updateSelectTradeList() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='IndustryID_chzn_o_4']"));
	}

	// 升级省份下拉框
	public WebElement updateSelectProvince() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='AreaID_chzn']"));
	}

	// 升级省份下拉‘四川’一列
	public WebElement updateSelectProviceList() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='AreaID_chzn_o_1']"));
	}

	// 升级详细通讯地址输入框
	public WebElement updateAdress() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='Address']"));
	}

	// 升级联系人输入框
	public WebElement updateContactName() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='UserName']"));
	}

	// 升级手机号码输入框
	public WebElement updateMobileNumber() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='MobileTel']"));
	}

	// 升级固定电话1输入框
	public WebElement updatePhoneNumber() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='Tel']"));
	}

	// 升级客户邮箱输入框
	public WebElement updateCustomerEmail() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='Email']"));
	}

	// 升级公司联系人职位单选按钮‘其他’
	public WebElement updateCompanyLiaisonRadio() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='SubmitInfoForm']/div[14]/div/div/label[5]/input"));
	}

	// 升级知晓渠道单选按钮‘其他’
	public WebElement updateChannelRadio() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='SubmitInfoForm']/div[15]/div/div/label[6]/input"));
	}

	// 升级有无网站单选按钮‘无’
	public WebElement updateIsWebsiteRadio() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='SubmitInfoForm']/div[16]/div/div/label[2]/input"));
	}

	// 升级是否联网单选按钮‘无’
	public WebElement updateIsNetworkRadio() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='SubmitInfoForm']/div[17]/div/div/label[2]/input"));
	}

	// 升级是否有分支机构单选按钮‘否’
	public WebElement updateIsExistBranchsRadio() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='SubmitInfoForm']/div[18]/div/div/label[2]/input"));
	}

	// 升级有多少台电脑单选按钮‘50台以上’
	public WebElement updateComputerCountRadio() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='SubmitInfoForm']/div[19]/div/div/label[5]/input"));
	}

	// 升级提交审核按钮
	public WebElement updateSubmitExamineButton() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='ConfirmInfo']"));
	}

	// 升级中客户子模块
	public WebElement productWaitUpdateSubmodule() {
		return DogOnlinePage.driver
				.findElement(By.cssSelector("#sidebar > ul > li.sub-menu.open > ul > li:nth-child(2)"));
	}

	// 升级中客户付款按钮
	public WebElement waitUpdatePayButton() {
		return DogOnlinePage.driver.findElement(
				By.cssSelector("#sample_1 > tbody > tr:nth-child(1) > td:nth-child(12) > button.btn.btn-success"));
	}

	// 支付密码输入框
	public WebElement payPassword() {
		return DogOnlinePage.driver.findElement(By.xpath("//*[@id='PassWord']"));
	}

	// 确认支付按钮
	public WebElement confirmPayButton() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#ConfirmPay"));
	}

	// 加密狗管理模块
	public WebElement dogManage() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#\\33 21"));
	}

	// 加密狗查询子模块
	public WebElement dogQuery() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#sidebar>ul>li:nth-child(5)>ul>li>a"));
	}

	// 输入关键字查询输入框
	public WebElement queryContent() {
		return DogOnlinePage.driver.findElement(By
				.cssSelector("#bigbigbig > div > div:nth-child(1) > div.col-md-5.pull-right.text-right > div > input"));
	}

	// 查询按钮
	public WebElement queryButton() {
		return DogOnlinePage.driver.findElement(
				By.cssSelector("#bigbigbig > div > div:nth-child(1) > div.col-md-5.pull-right.text-right > button"));
	}

	// 提交总部审核按钮
	public WebElement submitRegisterButton() {
		return DogOnlinePage.driver.findElement(
				By.cssSelector("#sample_1 > tbody.first > tr > td:nth-child(13) > button.btn.btn-success"));
	}

	// 代理注册审核通过按钮
	public WebElement registerPass() {
		return DogOnlinePage.driver.findElement(By.cssSelector("#Through"));
	}

}
