package demo.rasto.datamanagementservice.service;

import demo.rasto.datamanagementservice.dto.PrimeNumberDataDTO;

import java.util.List;

public interface DataManagementService {
    PrimeNumberDataDTO savePrimeNumberData(PrimeNumberDataDTO primeNumberDataDTO);
    List<PrimeNumberDataDTO> getPrimeNumbersData();
}
