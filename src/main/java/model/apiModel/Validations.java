package model.apiModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Validations {
    private String email;
    private String validFormat;
    private boolean local;
    private String domain;
    private String isDisposable;
    private String disposableDomains;
    private boolean aliases;
}
