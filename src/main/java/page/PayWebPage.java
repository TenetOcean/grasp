package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//任我行订货平台页面元素
public class PayWebPage {
	static WebDriver driver;

	public PayWebPage(WebDriver driver) {
		PayWebPage.driver = driver;
	}

	// 一级代理登录按钮
	public WebElement firstAgentLoginButton() {
		return PayWebPage.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[1]/div"));
	}

	// 二级代理登录按钮
	public WebElement secondAgentLoginButton() {
		return PayWebPage.driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[3]/div"));
	}

	// 登录用户名输入框
	public WebElement loginUserName() {
		return PayWebPage.driver.findElement(By.id("UserName"));
	}

	// 登录密码输入框
	public WebElement loginPassWord() {
		return PayWebPage.driver.findElement(By.id("PassWord"));
	}

	// 登录验证码输入框
	public WebElement loginUserCode() {
		return PayWebPage.driver.findElement(By.id("UserCode"));
	}

	// 登录按钮
	public WebElement loginButton() {
		return PayWebPage.driver.findElement(By.xpath("//*[@id='LoginForm']/button"));
	}

	// 通用系列产品购买按钮
	public WebElement hhBuyButton() {
		return PayWebPage.driver
				.findElement(By.xpath("//*[@id='page-wrapper']/div[3]/div[2]/div[5]/div/div/div[2]/div/a[1]"));
	}

	// 云辉煌系列产品购买按钮
	public WebElement yhhBuyButton() {
		return PayWebPage.driver
				.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[13]/div/div/div[2]/div/a[1]"));
	}

	// 财贸系列产品购买按钮
	public WebElement cmBuyButton() {
		return PayWebPage.driver
				.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div/div[2]/div/a[1]"));
	}
}