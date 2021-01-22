package page;

import base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import model.uiModel.Seller;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationSellerPage extends BasePage {

    private SelenideElement emailTextBox =
            $(By.xpath("//*[@id=\"join-now-tabbed-first\"]//div//div//input[@name='email']"));
    private SelenideElement passwordTextBox =
            $(By.xpath("//*[@id=\"join-now-tabbed-first\"]//div//div//input[@name='password']"));
    private SelenideElement createSiteBtn =
            $(By.xpath("//*[@id=\"join-now-tabbed-first\"]//div//button"));

    public RegistrationSellerPage inputSellerEmail(Seller seller) {
        emailTextBox.shouldBe(Condition.visible).setValue(seller.getEmail());
        return this;
    }

    public RegistrationSellerPage inputSellerPassword(Seller seller) {
        passwordTextBox.setValue(seller.getPassword());
        return this;
    }

    public EditChecklistPage clickBtnCreateSite() {
        createSiteBtn.click();
        return new EditChecklistPage();
    }
}
