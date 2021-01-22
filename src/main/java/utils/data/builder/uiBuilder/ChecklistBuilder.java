package utils.data.builder.uiBuilder;

import model.uiModel.Checklist;

public class ChecklistBuilder {

    public static Checklist defaultChecklist() {
        return Checklist.builder()
                .companyName("Danylo OOO")
                .phoneNumber("508310619")
                .build();
    }
}
