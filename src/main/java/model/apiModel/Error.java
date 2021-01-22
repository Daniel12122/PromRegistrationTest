package model.apiModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Error {
    private String message;
    private String error;
    private ArrayList<String> validationErrors;
}
