package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	static WebDriver driver;

	public RegisterPage(WebDriver driver) {
		RegisterPage.driver = driver;
	}

	// 注册狗号输入框
	public WebElement RegisterDogNumber() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='DogNo']"));
	}

	// 注册验证码/卡号输入框
	public WebElement RegisterCode() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='VerificaCode']"));
	}

	// 提交验证按钮
	public WebElement submitButton() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='ConfirmInfo']"));
	}

	// 代理商销售人员输入框
	public WebElement agentName() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='AgentName']"));
	}

	// 联系人输入框
	public WebElement contactName() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='UserName']"));
	}

	// 客户邮箱输入框
	public WebElement customerEmail() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='Email']"));
	}

	// 公司名称输入框
	public WebElement companyName() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='CompanyName']"));
	}

	// 详细通讯地址输入框
	public WebElement adress() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='Address']"));
	}

	// 所属行业下拉框
	public WebElement selectTrade() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='IndustryID_chzn']"));
	}

	// 所属行业下拉‘IT业’一列
	public WebElement selectTradeList() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='IndustryID_chzn_o_4']"));
	}

	// 省份下拉框
	public WebElement selectProvince() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='AreaID_chzn']"));
	}

	// 省份下拉‘四川’一列
	public WebElement selectProviceList() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='AreaID_chzn_o_1']"));
	}

	// 手机号码输入框
	public WebElement mobileNumber() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='MobileTel']"));
	}

	// 固定电话1输入框
	public WebElement phoneNumber() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='Tel']"));
	}

	// 公司联系人职位单选按钮‘其他’
	public WebElement companyLiaisonRadio() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='dch']/div[1]/div/div/label[5]/input"));
	}

	// 知晓渠道单选按钮‘其他’
	public WebElement channelRadio() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='dch']/div[2]/div/div/label[6]/input"));
	}

	// 有无网站单选按钮‘无’
	public WebElement isWebsiteRadio() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='dch']/div[3]/div/div/label[2]/input"));
	}

	// 是否联网单选按钮‘无’
	public WebElement isNetworkRadio() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='dch']/div[4]/div/div/label[2]/input"));
	}

	// 是否有分支机构单选按钮‘否’
	public WebElement isExistBranchsRadio() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='dch']/div[5]/div/div/label[2]/input"));
	}

	// 有多少台电脑单选按钮‘50台以上’
	public WebElement computerCountRadio() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='dch']/div[6]/div/div/label[5]/input"));
	}

	// 提交注册信息按钮
	public WebElement submitRegisterButton() {
		return RegisterPage.driver.findElement(By.xpath("//*[@id='ConfirmInfo']"));
	}
}