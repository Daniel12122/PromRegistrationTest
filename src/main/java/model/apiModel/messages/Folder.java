package model.apiModel.messages;

public enum Folder {
    inbox("inbox"),
    all("all"),
    sent("sent"),
    spam("spam"),
    trash("trash");

    private String value;

    Folder(String value) {
        this.value = value;
    }
}
