package model.apiModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String _id;
    private String email;
    private String invoiceEmail;
    private boolean capturePrivate;
    private int messageLimit;
    private int sendsRemaining;
    private int privateDomain;
    private int privateAddressCredits;
    private int whitelistAccess;
    private int moAPICount;
    private int apiMonthlyLimit;
    private String billingHold;
    private String disabled;
    private ArrayList<String> recents;
    private ArrayList<String> labels;
    private String company;
    private String address;
}
