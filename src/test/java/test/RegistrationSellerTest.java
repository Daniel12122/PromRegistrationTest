package test;

import base.BaseTest;
import model.uiModel.Checklist;
import model.uiModel.Seller;
import org.junit.Test;
import page.HomePage;
import utils.api.HTTPMethods;
import utils.data.builder.uiBuilder.ChecklistBuilder;
import utils.data.builder.uiBuilder.SellerBuilder;

public class RegistrationSellerTest extends BaseTest {

    @Test
    public void registrationSellerTest() {

        Seller seller = SellerBuilder.defaultSeller();
        Checklist checklist = ChecklistBuilder.defaultChecklist();

        HomePage
                .openHomePage()
                .clickBtnRegistrationUser()
                .clickBtnRegistrationSeller()
                .inputSellerEmail(seller)
                .inputSellerPassword(seller)
                .clickBtnCreateSite()
                .selectOnlineBusiness()
                .inputCompanyName(checklist)
                .inputPhoneNumber(checklist)
                .clickBtnCreateShop()
                .clickAgree()
                .clickBtnConfirmEmail()
                .confirmationEmailAddress()
                .verifyConfirmationEmailAddress();
    }
}
