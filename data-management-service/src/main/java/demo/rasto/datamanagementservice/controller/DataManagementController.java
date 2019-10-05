package demo.rasto.datamanagementservice.controller;

import demo.rasto.datamanagementservice.dto.PrimeNumberDataDTO;
import demo.rasto.datamanagementservice.dto.PrimeNumberDataResponse;
import demo.rasto.datamanagementservice.service.DataManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/data-management")
public class DataManagementController {

    @Autowired
    private DataManagementService dataManagementService;

    @PostMapping(value = "/prime-numbers-data", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PrimeNumberDataDTO> savePrimeNumberData(@RequestBody @Valid PrimeNumberDataDTO primeNumberInfo) {
        PrimeNumberDataDTO dto = dataManagementService.savePrimeNumberData(primeNumberInfo);
        return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/prime-numbers-data", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PrimeNumberDataResponse> getPrimeNumberData() {
        List<PrimeNumberDataDTO> primeNumberDataDTOs = dataManagementService.getPrimeNumbersData();
        PrimeNumberDataResponse response = new PrimeNumberDataResponse();
        response.setPrimeNumberInfos(primeNumberDataDTOs);
        return ResponseEntity.ok(response);
    }
}
