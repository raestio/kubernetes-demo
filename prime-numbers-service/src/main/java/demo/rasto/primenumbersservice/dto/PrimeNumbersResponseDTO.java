package demo.rasto.primenumbersservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class PrimeNumbersResponseDTO {

    @JsonProperty("primeNumbers")
    private List<Long> primeNumbers = new ArrayList<>();

    @JsonProperty("timeSpentInMillis")
    private Long timeSpentInMillis;
}
