package grasp;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import page.PayWebPage;

public class HhLogin {
	protected WebDriver driver;

	public HhLogin(WebDriver driver) {
		this.driver = driver;
		this.driver.manage().window().maximize();
		this.driver.get("http://192.168.9.50:8100");
		String loginHandle = this.driver.getWindowHandle();
		PayWebPage pay = new PayWebPage(this.driver);
		pay.firstAgentLoginButton().click();
		pay.loginUserName().sendKeys("02899999");
		pay.loginPassWord().sendKeys("123123");
		pay.loginUserCode().sendKeys("dfdsg2165498jdofdfd");
		pay.loginButton().sendKeys(Keys.ENTER);
		pay.hhBuyButton().click();
		Set<String> allHandle = this.driver.getWindowHandles();
		for (String handle : allHandle) {
			if (handle != loginHandle) {
				this.driver.switchTo().window(handle);
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}