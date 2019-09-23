package demo.rasto.datamanagementservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
public class PrimeNumberDataDTO {

    @NotNull
    @JsonProperty("primeNumber")
    private Long primeNumber;

    @NotNull
    @JsonProperty("timeSpentInMillis")
    private Long timeSpentInMillis;
}
