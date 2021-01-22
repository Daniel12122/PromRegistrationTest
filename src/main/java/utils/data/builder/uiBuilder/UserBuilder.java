package utils.data.builder.uiBuilder;

import model.uiModel.User;

import static utils.api.Constants.EMAIL;

public class UserBuilder {

    public static User defaultUser() {
        return User.builder()
                .name("Danylo")
                .email(EMAIL)
                .password("erg9a4gr")
                .build();
    }
}
