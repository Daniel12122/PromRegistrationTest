package page;

import base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import model.uiModel.Checklist;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EditChecklistPage extends BasePage {
    private SelenideElement productsDropDown =
            $(By.xpath("//span[@class='x-drop-down__value']"));
    private SelenideElement offlineBusinessBtn =
            $(By.xpath("//li[text()='Продаю, но не в интернете / начинаю бизнес']"));
    private SelenideElement onlineBusinessBtn =
            $(By.xpath("//*[@id='registrationStep']//li[1]"));
    private SelenideElement nameCompanyTextBox =
            $(By.xpath("//*[@id=\"registrationStep\"]//input[@name='name']"));
    private SelenideElement phoneTextBox =
            $(By.xpath("//*[@id=\"registrationStep\"]//input[@name='phone']"));
    private SelenideElement createShopBtn =
            $(By.xpath("//*[@id=\"registrationStep\"]//button"));

    public EditChecklistPage selectOnlineBusiness() {
        productsDropDown.shouldBe(Condition.visible).click();
        onlineBusinessBtn.click();
        return this;
    }

    public EditChecklistPage selectOfflineBusiness() {
        productsDropDown.shouldBe(Condition.visible).click();
        offlineBusinessBtn.click();
        return this;
    }

    public EditChecklistPage inputCompanyName(Checklist checklist) {
        nameCompanyTextBox.setValue(checklist.getCompanyName());
        return this;
    }

    public EditChecklistPage inputPhoneNumber(Checklist checklist) {
        phoneTextBox.setValue(checklist.getPhoneNumber());
        return this;
    }

    public OnBoardingPage clickBtnCreateShop() {
        createShopBtn.click();
        return new OnBoardingPage();
    }

}
