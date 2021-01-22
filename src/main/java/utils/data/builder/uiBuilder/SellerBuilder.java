package utils.data.builder.uiBuilder;

import model.uiModel.Seller;

import static utils.api.Constants.EMAIL;

public class SellerBuilder {

    public static Seller defaultSeller() {
        return Seller.builder()
                .email(EMAIL)
                .password("erg9a4grq")
                .build();
    }
}
