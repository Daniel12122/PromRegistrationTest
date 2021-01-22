package model.apiModel.messages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeleteMessages {
    private String _id;
    private String inbox;
    private String message;
}
