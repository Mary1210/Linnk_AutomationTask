package Tests;

import Pages.SubscriptionPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import Pages.HomePage;

public class SubscriptionPageTest extends TestBase {

	HomePage homePage;
	SubscriptionPage subscriptionPage;
	
	@BeforeClass
	public void SubscriptionPageTestBeforeClass() {
		homePage = new HomePage(driver);
		subscriptionPage = new SubscriptionPage(driver);
	}
	
	@Test
	public void ValidateSubscriptionPackagsForEachCountry()
	{
		homePage.ChangeLanguageToEnglish();
		Assert.assertTrue(homePage.getCountryCurrentName().contains("KSA"));
		Assert.assertTrue(subscriptionPage.getLitePackageName().contains("LITE"));
		Assert.assertTrue(subscriptionPage.getClassicPackageName().contains("CLASSIC"));
		Assert.assertTrue(subscriptionPage.getPremiumPackageName().contains("PREMIUM"));
		Assert.assertTrue(subscriptionPage.getLiteCurrency().contains("15 SAR/month"));
		Assert.assertTrue(subscriptionPage.getClassicCurrency().contains("25 SAR/month"));
		Assert.assertTrue(subscriptionPage.getPremiumCurrency().contains("60 SAR/month\n"));
		homePage.openSubscriptionKuwait();
		Assert.assertTrue(homePage.getCountryCurrentName().contains("Kuwait"));
		Assert.assertTrue(subscriptionPage.getLitePackageName().contains("LITE"));
		Assert.assertTrue(subscriptionPage.getClassicPackageName().contains("CLASSIC"));
		Assert.assertTrue(subscriptionPage.getPremiumPackageName().contains("PREMIUM"));
		Assert.assertTrue(subscriptionPage.getLiteCurrency().contains("1.2 KWD/month"));
		Assert.assertTrue(subscriptionPage.getClassicCurrency().contains("2.5 KWD/month"));
		Assert.assertTrue(subscriptionPage.getPremiumCurrency().contains("4.8 KWD/month"));
		homePage.openSubscriptionBahrain();
		Assert.assertTrue(homePage.getCountryCurrentName().contains("Bahrain"));
		Assert.assertTrue(subscriptionPage.getLitePackageName().contains("LITE"));
		Assert.assertTrue(subscriptionPage.getClassicPackageName().contains("CLASSIC"));
		Assert.assertTrue(subscriptionPage.getPremiumPackageName().contains("PREMIUM"));
		Assert.assertTrue(subscriptionPage.getLiteCurrency().contains("2 BHD/month"));
		Assert.assertTrue(subscriptionPage.getClassicCurrency().contains("3 BHD/month"));
		Assert.assertTrue(subscriptionPage.getPremiumCurrency().contains("6 BHD/month\n"));
	}

}
