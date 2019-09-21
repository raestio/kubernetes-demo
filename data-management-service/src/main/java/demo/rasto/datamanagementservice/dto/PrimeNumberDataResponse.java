package demo.rasto.datamanagementservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PrimeNumberDataResponse {

    @JsonProperty("primeNumberInfos")
    private List<PrimeNumberDataDTO> primeNumberInfos = new ArrayList<>();
}
