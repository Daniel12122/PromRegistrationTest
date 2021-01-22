package utils.data.builder.apiBuilder;

import com.github.javafaker.Faker;
import model.apiModel.Addresses;

public class AddressesBuilder {

    public static Addresses defaultAddresses() {
        return Addresses.builder()
                .info("string")
                .forward("")
                .enabledws(false)
                .webhook("")
                .webhookSlack("")
                .webhookSlackToFrom(true)
                .build();
    }

    public static Addresses randomAddresses() {
        Faker faker = new Faker();
        return Addresses.builder()
                .info(faker.address().fullAddress())
                .forward("")
                .enabledws(faker.random().nextBoolean())
                .webhook("")
                .webhookSlack("")
                .webhookSlackToFrom(faker.random().nextBoolean())
                .build();
    }
}
