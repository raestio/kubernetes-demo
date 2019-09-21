package demo.rasto.primenumbersservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rastislav Zlacky (rastislav.zlacky@inventi.cz) on 18.09.2019.
 */
@Data
public class PrimeNumbersResponseDTO {

    @JsonProperty("primeNumbers")
    private List<Long> primeNumbers = new ArrayList<>();

    @JsonProperty("timeSpentInMillis")
    private Long timeSpentInMillis;
}
