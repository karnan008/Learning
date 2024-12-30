package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import page.Homepage;
import page.addContact;

public class contactSmoke extends ProjectSpecificationMethod {

	@Test(priority=1)
	public static void contactSignUp() throws InterruptedException
	{
		Homepage SignUp = new Homepage(driver);
		SignUp.launchandLoad(contactURL);
		SignUp.contactSignUp()
		.contactFirstName()
		.contactLastName()
		.contactEmail("testing.com")
		.contactPassword("demo123")
		.contactSubmit();	

	}
	@Test(priority=2)
	public static void contactAdd() throws InterruptedException
	{
		addContact AddContact = new page.addContact(driver);
		AddContact.contactAddbtn()
		.contactFirstName("Sathiya")
		.contactLastName("Priya")
		.contactDOB("1990-08-30")
		.contactEmail("testing.com")
		.contactPhone(1234567890)
		.contactAdd1("4th cross street")
		.contactAdd2("Guindy")
		.contactCity("Chennai")
		.contactState("TN")
		.contactPostalCode("600098")
		.contactCountry("India")
		.contactSubmit();
		AddContact.contactAddbtn()
		.contactFirstName("Praba")
		.contactLastName("karan")
		.contactDOB("1990-08-30")
		.contactEmail("testing.com")
		.contactPhone(1234567890)
		.contactAdd1("4th cross street")
		.contactAdd2("Guindy")
		.contactCity("Chennai")
		.contactState("TN")
		.contactPostalCode("600098")
		.contactCountry("India")
		.contactSubmit();
		AddContact.contactAddbtn()
		.contactFirstName("BMP")
		.contactLastName("Murugaperumal")
		.contactDOB("1990-08-30")
		.contactEmail("testing.com")
		.contactPhone(1234567890)
		.contactAdd1("4th cross street")
		.contactAdd2("Guindy")
		.contactCity("Chennai")
		.contactState("TN")
		.contactPostalCode("600098")
		.contactCountry("India")
		.contactSubmit();
		AddContact.contactAddbtn()
		.contactFirstName("Varadha")
		.contactLastName("Rajan")
		.contactDOB("1990-08-30")
		.contactEmail("testing.com")
		.contactPhone(1234567890)
		.contactAdd1("4th cross street")
		.contactAdd2("Guindy")
		.contactCity("Chennai")
		.contactState("TN")
		.contactPostalCode("600098")
		.contactCountry("India")
		.contactSubmit();
		AddContact.contactAddbtn()
		.contactFirstName("Arun")
		.contactLastName("Kumar")
		.contactDOB("1990-08-30")
		.contactEmail("testing.com")
		.contactPhone(1234567890)
		.contactAdd1("4th cross street")
		.contactAdd2("Guindy")
		.contactCity("Chennai")
		.contactState("TN")
		.contactPostalCode("600098")
		.contactCountry("India")
		.contactSubmit()
		.contactOrderVerify();
	}
	@Test(priority=3)
	public static void contactEdit() throws InterruptedException
	{
		addContact AddContact = new page.addContact(driver);
		AddContact.contactOpen()
		.contactEdit()
		.contactEditFirstName("Arun New")
		.contactSubmit()
		.contactReturn()
		.contactEditVerify();

	}
	@Test(priority=4)
	public static void contactDelete() throws InterruptedException
	{
		addContact AddContact = new page.addContact(driver);
		AddContact.contactOpen2()
		.contactDelete()
		.contactDeleteok();
	}
	@Test(priority=5)
	public static void contactLogout() throws InterruptedException
	{
		addContact AddContact = new page.addContact(driver);
		AddContact.contactLogout()
			.contactLoginScreen();
	}
}
