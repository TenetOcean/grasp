package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//客户信息管理系统页面元素
public class CustomerPage {
	private static WebDriver d;
	static WebDriver driver = d;

	public CustomerPage(WebDriver driver) {
		d = driver;
	}

	// 登录用户名输入框
	public WebElement loginUserName() {
		return d.findElement(By.cssSelector("#UserCode"));
	}

	// 登录密码输入框
	public WebElement loginPassWord() {
		return d.findElement(By.cssSelector("#PassWord"));
	}

	// 登录验证码输入框
	public WebElement loginUserCode() {
		return d.findElement(By.cssSelector("#ValiCode"));
	}

	// 登录按钮
	public WebElement loginButton() {
		return d.findElement(By.cssSelector("#InsertRoleFrorm > fieldset > div.clearfix > button"));
	}

	// 注册审核模块
	public WebElement registerExamine() {
		return d.findElement(By.cssSelector("#\\34 01 > a"));
	}

	// 注册待审核信息子模块
	public WebElement waitRegisterExamine() {
		return d.findElement(By.cssSelector("#\\34 01001 > a"));
	}

	// 注册待审核信息子模块搜索框
	public WebElement waitRegisterSearch() {
		return d.findElement(By.cssSelector("#sample-table-2_filter > label > input"));
	}

	// 第一条待注册审核信息
	public WebElement firstWaitRegisterContent() {
		return d.findElement(By.cssSelector("#sample-table-2 > tbody > tr"));
	}

	// 注册审核通过按钮
	public WebElement registerPassButton() {
		return d.findElement(By.cssSelector("#Form > div.form-actions > div > button.btn.btn-success"));
	}

	// 注册审核通过弹出框提交按钮
	public WebElement submitButton() {
		return d.findElement(By.cssSelector("#layui-layer2 > div.layui-layer-btn > a.layui-layer-btn0"));
	}

	// 升级审核模块
	public WebElement updateExamine() {
		return d.findElement(By.cssSelector("#\\35 01 > a"));
	}

	// 升级待审核信息子模块
	public WebElement waitUpdateExamine() {
		return d.findElement(By.cssSelector("#\\35 01001 > a"));
	}

	// 升级审核通过弹出框提交按钮
	public WebElement updateSubmitButton() {
		return d.findElement(By.cssSelector("#layui-layer2 > div.layui-layer-btn > a.layui-layer-btn0"));
	}

	// 搜索框
	public WebElement searchInput() {
		return d.findElement(By.cssSelector("#sample-table-2_filter > label > input"));
	}

	// 第一条升级待审核信息
	public WebElement firstWaitExamineContent() {
		return d.findElement(By.cssSelector("#sample-table-2 > tbody > tr"));
	}

	// 待审核信息审核通过按钮
	public WebElement examinePassButton() {
		return d.findElement(By.cssSelector("#Form > div.form-actions > div > button.btn.btn-success"));
	}
}
