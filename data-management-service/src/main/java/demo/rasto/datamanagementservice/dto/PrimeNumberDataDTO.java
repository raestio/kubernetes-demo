package demo.rasto.datamanagementservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author Rastislav Zlacky (rastislav.zlacky@inventi.cz) on 21.09.2019.
 */
@Data
public class PrimeNumberDataDTO {

    @NotNull
    @JsonProperty("primeNumber")
    private Long primeNumber;

    @NotNull
    @JsonProperty("timeSpentInMillis")
    private Long timeSpentInMillis;
}
