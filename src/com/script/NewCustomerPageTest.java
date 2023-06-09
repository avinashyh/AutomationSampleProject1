package com.script;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.generic.BasePage;
import com.generic.BaseTest;
import com.page.LoginPage;
import com.page.NewCustomerPage;

public class NewCustomerPageTest extends BaseTest {
	@Test
	public void testNewCustomerPage() {

		NewCustomerPage nc = new NewCustomerPage(driver);

		nc.setUserName("mngr492172");
		nc.setPassword("busUpYt");
		nc.clickLoginBTN();
		nc.verifyMessage("Welcome To Manager's Page of Guru99 Bank");
		nc.clickNewCustomer();
		nc.setCustomerName("Avinash");
		nc.clickFemale();
		nc.setDateOfBirth("09/28/1987");
		nc.setAddress("Shivaji Nagar 3rd cross");
		nc.setCity("Haveri");
		nc.setState("Karnataka");
		nc.setPincode("581110");
		nc.setTelephone("9008849997");
		nc.setEmailID("avinashyh10412@gmail.com");
		nc.setPassword1("123456");
		nc.clickSubmit();
		WebElement e = driver.findElement(By.className("heading3"));

		System.out.println(e.getText());

	}
}