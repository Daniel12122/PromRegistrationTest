package utils.data.builder.apiBuilder;

import model.apiModel.messages.From;
import model.apiModel.messages.Messages;
import model.apiModel.messages.To;

import java.util.ArrayList;

public class MessagesBuilder {

    public static Messages defaultMessages() {
        To to1 = new To("someone", "someone@mailsac.com");
        To to2 = new To("person", "person@mailsac.com");
        From from1 = new From("somebody", "somebody@mailsac.com");
        ArrayList<To> toEmailList = new ArrayList<To>();
        toEmailList.add(to1);
        toEmailList.add(to2);
        ArrayList<From> fromEmailList = new ArrayList<From>();
        fromEmailList.add(from1);
        return Messages.builder()
                .to(toEmailList)
                .from(fromEmailList)
                .subject("hey!")
                .build();
    }
}
