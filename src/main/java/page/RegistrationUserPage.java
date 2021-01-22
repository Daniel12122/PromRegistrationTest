package page;

import base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationUserPage extends BasePage {
    private SelenideElement registrationSellerBtn =
            $(By.xpath("//span[@class='lp-button__text']"));
    private SelenideElement nameTextBox =
            $(By.xpath("//*[@id=\"ZF6AC6B8D-6CD5-4C02-B416-063B096E4CDB\"]//input[@data-qaid=\"name\"]"));
    private SelenideElement emailTextBox =
            $(By.xpath("//*[@id=\"ZF6AC6B8D-6CD5-4C02-B416-063B096E4CDB\"]//input[@data-qaid=\"email\"]"));
    private SelenideElement passwordSiteBtn =
            $(By.xpath("//*[@id=\"ZF6AC6B8D-6CD5-4C02-B416-063B096E4CDB\"]//input[@data-qaid=\"password\"]"));
    private SelenideElement createUserBtn =
            $(By.xpath("//*[@id=\"Z396633F1-6D03-458E-946B-204A7B642318\"]//button"));

    public RegistrationSellerPage clickBtnRegistration() {
        registrationSellerBtn.shouldBe(Condition.visible).click();
        return new RegistrationSellerPage();
    }
}
