package model.apiModel.attachment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attachments {

    private String messageId;
    private String email;
    private String attachmentIdentifier;
    private String startDate;
    private String endDate;
    private int skip;
    private int limit;
    private String md5sum;

}
