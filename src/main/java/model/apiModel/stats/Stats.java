package model.apiModel.stats;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stats {
    private String startDate;
    private String endDate;
    private int skip;
    private int limit;
}
