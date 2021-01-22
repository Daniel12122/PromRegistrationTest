package model.apiModel.messages;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Messages {
    private String _id;
    private ArrayList<From> from;
    private ArrayList<To> to;
    private ArrayList<Cc> cc;
    private ArrayList<Bcc> bcc;
    private String subject;
    private String savedBy;
    private String inbox;
    private String originalInbox;
    private String domain;
    private String received;
    private int size;
    private ArrayList<String> attachments;
    private String ip;
    private String via;
    private Folder folder;
    private ArrayList<String> labels;
    private String read;
    private String rt;
    private ArrayList<String> links;
    private int spam;
}
