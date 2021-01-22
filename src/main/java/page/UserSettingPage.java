package page;

import base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.Assertions.assertThat;

public class UserSettingPage extends BasePage {

    private SelenideElement myOfficeDropDown =
            $(By.xpath("//span[@class='b-header__controls-link']"));
    private SelenideElement exitBtn =
            $(By.xpath("//div[text()='Выйти']"));

    public UserSettingPage verifyConfirmationEmailAddress() {
        myOfficeDropDown.shouldBe(Condition.visible).click();
        assertThat(exitBtn.isDisplayed()).as("You have not verified your email address").isTrue();
        return this;
    }
}
