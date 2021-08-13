package grasp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import page.PayWebPage;

public class Login {
	protected WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().window().maximize();
		this.driver.get("http://192.168.9.50:8100");
		PayWebPage pay = new PayWebPage(this.driver);
		pay.firstAgentLoginButton().click();
		pay.loginUserName().sendKeys("02899999");
		pay.loginPassWord().sendKeys("123123");
		pay.loginUserCode().sendKeys("dfdsg2165498jdofdfd");
		pay.loginButton().sendKeys(Keys.ENTER);
	}
}