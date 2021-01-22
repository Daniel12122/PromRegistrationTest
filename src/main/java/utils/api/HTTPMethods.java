package utils.api;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import page.UserSettingPage;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.open;
import static io.restassured.RestAssured.given;
import static utils.api.Constants.EMAIL_MESSAGES_ENDPOINT;
import static utils.api.Constants.SESSION_ID;

public class HTTPMethods {

    public String linksList() {
        RestAssured.defaultParser = Parser.JSON;
        return given()
                .header("Mailsac-Key", SESSION_ID)
                .when()
                .get(EMAIL_MESSAGES_ENDPOINT)
                .then()
                .statusCode(200)
                .extract()
                .path("links").toString()
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");
    }

    public String confirmationLink(String linksList) {
        return Stream.of(linksList.split(","))
                .collect(Collectors.toList())
                .stream()
                .filter(i -> i.contains("https://promaaua.esclick.me/sl?u=https%3A%2F%2F%25GENERAL"))
                .collect(Collectors.joining());
    }

    public UserSettingPage confirmationEmailAddress() {
        open(confirmationLink(linksList()));
        return new UserSettingPage();
    }
}
