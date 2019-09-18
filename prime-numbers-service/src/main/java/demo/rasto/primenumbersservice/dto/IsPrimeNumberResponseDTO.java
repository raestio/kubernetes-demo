package demo.rasto.primenumbersservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IsPrimeNumberResponseDTO {

    @JsonProperty("isPrimeNumber")
    private Boolean isPrimeNumber;

    @JsonProperty("timeSpentInMillis")
    private Long timeSpentInMillis;

    @JsonProperty("factor")
    private Long factor;
}
