package pom;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//	without using pageFactory

	WebDriver driver;
//	constructor

	LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
//		with using PageFactory
		PageFactory.initElements(driver, this);

	}

//	locators
	/*
	 * By uNmae = By.xpath("//input[@name='username']"); By uPassword =
	 * By.xpath("//input[@name='password']"); By btnLogin =
	 * By.xpath("//button[text()=' Login ']");
	 */

//	@FindBy(xpath = "//input[@name='username']")
	@FindBy(how=How.XPATH ,using = "//input[@name='username']")
	WebElement txtUname;
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;
	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement btnLogin;

//	Action methods
	public void setData(String username, String userpassword) {
		/*
		 * driver.findElement(uNmae).sendKeys(username);
		 * driver.findElement(uPassword).sendKeys(userpassword);
		 * driver.findElement(btnLogin).click();
		 */
		txtUname.sendKeys(username);
		txtPassword.sendKeys(userpassword);
		btnLogin.click();
	}

}
