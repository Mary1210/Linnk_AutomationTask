package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscriptionPage extends PageBase
{
	public SubscriptionPage(WebDriver driver) {
		super(driver);
	}

	By LitePackage = By.id("name-lite");

	By ClassicPackage = By.id("name-classic");

	By PremiumPackage = By.id("name-premium");

	By LiteCurrency = By.id("currency-lite");

	By ClassicCurrency = By.id("currency-classic");

	By PremiumCurrency = By.id("name-premium");

	public String getLitePackageName()
	{
		return getText(LitePackage);
	}

	public String getClassicPackageName()
	{
		return getText(ClassicPackage);
	}

	public String getPremiumPackageName()
	{
		return getText(PremiumPackage);
	}

	public String getLiteCurrency()
	{
		return getText(LiteCurrency);
	}

	public String getClassicCurrency()
	{
		return getText(ClassicCurrency);
	}

	public String getPremiumCurrency()
	{
		return getText(PremiumCurrency);
	}
}
