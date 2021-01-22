package utils.api;


public class Constants {
    public static String EMAIL = "pazikovd@mailsac.com";
    public static String BASE_URL = "https://mailsac.com/api";
    public static String ADDRESSES_ENDPOINT = BASE_URL + "/addresses/";
    public static String VALIDATIONS_ENDPOINT = BASE_URL + "/validations/addresses/";
    public static String EMAIL_MESSAGES_ENDPOINT = BASE_URL + "/addresses/" + EMAIL + "/messages";
    public static String USER_ACCOUNT_ENDPOINT = BASE_URL + "/me";
    public static String ACCOUNT_STATS_ENDPOINT = BASE_URL + "/me/stats";
    public static String MESSAGES_ATTACHMENTS_ENDPOINT = BASE_URL + "/addresses/" + EMAIL +
            "/messages/";
    public static String EMAIL_STATS_ENDPOINT = BASE_URL + "/mailstats";
    public static String WEB_SOCKETS_ENDPOINT = BASE_URL + "/custom_web_sockets";
    public static String WEBHOOKS_ENDPOINT = BASE_URL + "/custom_webhooks";
    public static String SESSION_ID = "k_QC3AgcdWUSe6JCSbKnikyVQ3Q01fxu18koQWFT";

}
