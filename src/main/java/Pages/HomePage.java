package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By ArabicLanguage = By.linkText("العربية");

    By EnglishLanguage = By.linkText("English");

    By CountryCurrent = By.xpath("//div[contains(@class, 'head-links')]//div[contains(@class, 'country-current')]");

    By EgyptLink = By.id("eg");

    By SaudiArabiaLink = By.id("sa");

    By BahrainLink = By.id("bh");
    By KuwaitLink = By.id("kw");

    public void ChangeLanguageToEnglish()
    {
        clickButton(EnglishLanguage);
    }

    public void ChangeLanguageToArabic()
    {
        clickButton(ArabicLanguage);
    }

    public void openSubscriptionPageEgypt()
    {
        clickButton(CountryCurrent);
        clickButton(EgyptLink);
    }

    public void openSubscriptionPageSaudiArabia()
    {
        clickButton(CountryCurrent);
        clickButton(SaudiArabiaLink);
    }

    public void openSubscriptionBahrain()
    {
        clickButton(CountryCurrent);
        clickButton(BahrainLink);
    }

    public void openSubscriptionKuwait()
    {
        clickButton(CountryCurrent);
        clickButton(KuwaitLink);
    }

    public String getCountryCurrentName()
    {
        return getText(CountryCurrent);
    }
}
