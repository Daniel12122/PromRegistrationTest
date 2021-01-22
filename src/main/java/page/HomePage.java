package page;

import base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {

    private SelenideElement registrationBtn = $(By.xpath("//a[@data-qaid='qa_register_btn']"));

    public static HomePage openHomePage() {
        open("https://prom.ua/ua/");
        return new HomePage();
    }

    public RegistrationUserPage clickBtnRegistration() {
        registrationBtn.shouldBe(Condition.visible).click();
        return new RegistrationUserPage();
    }

}
