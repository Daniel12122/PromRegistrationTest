package model.apiModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Addresses {
    private String _id;
    private String info;
    private boolean enabledws;
    private String forward;
    private String webhook;
    private String webhookSlack;
    private boolean webhookSlackToFrom;
    private String owner;
    private String encryptedInbox;
    private String catchAll;
    private String created;
    private String updated;
}
