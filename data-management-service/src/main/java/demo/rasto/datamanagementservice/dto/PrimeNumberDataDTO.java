package demo.rasto.datamanagementservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author Rastislav Zlacky (rastislav.zlacky@inventi.cz) on 21.09.2019.
 */
@Data
public class PrimeNumberDataDTO {

    @JsonProperty("primeNumber")
    private Long primeNumber;

    @JsonProperty("timeSpentInMillis")
    private Long timeSpentInMillis;
}
