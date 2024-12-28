package testcases;


import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import page.Homepage;
import page.MainScreen;

public class Smoke extends ProjectSpecificationMethod {




	@Test(priority=1)
	public static void Login()
	{
		Homepage obj = new Homepage(driver);
		obj.launchandLoad();
		obj.loginClick()
		.mail("meh472@gmail.com")
		.Password("Sathiya86")
		.LoginButton()
		.ValidateLogin();
	}
	@Test(priority=2)
	public static void ProdusctOrdered() throws InterruptedException
	{
		Homepage obj = new Homepage(driver);
		obj.computersTab()
		.clickDesktop()
		.addProduct()
		.addtoCart()
		.gotoCart()
		.verifyProduct()
		.terms()
		.checkOut()
		.addressCondition()
		.continuebtn()
		.continue2()
		.continue3()
		.continue4()
		.continue5()
		.confirm()
		.verifyOrderPlacement();
	}
	@Test(priority=3)
	public static void Logout()
	{
		Homepage obj = new Homepage(driver);
		obj.Logout();
	}

}
