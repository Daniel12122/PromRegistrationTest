package page;

import base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.api.HTTPMethods;

import static com.codeborne.selenide.Selenide.$;

public class OnBoardingPage extends BasePage {

    private SelenideElement agreeCheckBox = $(By.xpath("//input[@type='checkbox']"));
    private SelenideElement agreeBtn = $(By.xpath("//span[text()='Даю згоду']"));
    private SelenideElement agreeEmailBtn = $(By.xpath("//*[@id=\"email_thin\"]//button"));

    public OnBoardingPage clickAgree() {
        agreeCheckBox.click();
        agreeBtn.shouldBe(Condition.visible).click();
        return this;
    }

    public HTTPMethods clickBtnConfirmEmail() {
        agreeEmailBtn.click();
        return new HTTPMethods();
    }
}
