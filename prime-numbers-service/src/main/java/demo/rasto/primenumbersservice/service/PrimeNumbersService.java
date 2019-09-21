package demo.rasto.primenumbersservice.service;


import demo.rasto.primenumbersservice.dto.IsPrimeNumberResponseDTO;
import demo.rasto.primenumbersservice.dto.PrimeNumbersResponseDTO;

public interface PrimeNumbersService {
    IsPrimeNumberResponseDTO isPrimeNumber(Long number);

    PrimeNumbersResponseDTO getFirstNPrimeNumbers(Long n);
}
