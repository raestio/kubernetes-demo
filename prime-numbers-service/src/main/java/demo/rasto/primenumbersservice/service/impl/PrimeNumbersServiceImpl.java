package demo.rasto.primenumbersservice.service.impl;

import demo.rasto.primenumbersservice.dto.IsPrimeNumberResponseDTO;
import demo.rasto.primenumbersservice.dto.PrimeNumbersResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalLong;
import java.util.stream.LongStream;

@Service
public class PrimeNumbersServiceImpl implements PrimeNumbersService {

    @Override
    public IsPrimeNumberResponseDTO isPrimeNumber(Long number) {
        long previous = System.currentTimeMillis();
        OptionalLong optionalLong = LongStream.range(2, number / 2 + 1).filter(i -> number % i == 0).findFirst();
        long total = System.currentTimeMillis() - previous;
        boolean isPrime = !optionalLong.isPresent();
        return mapResponse(optionalLong, total, isPrime);
    }

    @Override
    public PrimeNumbersResponseDTO getFirstNPrimeNumbers(Long n) {
        List<Long> primeNumbers = new ArrayList<>();
        long previous = System.currentTimeMillis();
        long number = 2;
        while (primeNumbers.size() < n) {
            IsPrimeNumberResponseDTO isPrimeNumberDTO = isPrimeNumber(number);
            if (isPrimeNumberDTO.getIsPrimeNumber()) {
                primeNumbers.add(number);
            }
            number++;
        }
        long total = System.currentTimeMillis() - previous;
        PrimeNumbersResponseDTO primeNumbersResponseDTO = new PrimeNumbersResponseDTO();
        primeNumbersResponseDTO.setPrimeNumbers(primeNumbers);
        primeNumbersResponseDTO.setTimeSpentInMillis(total);
        return primeNumbersResponseDTO;
    }

    private IsPrimeNumberResponseDTO mapResponse(OptionalLong optionalLong, long total, boolean isPrime) {
        IsPrimeNumberResponseDTO responseDTO = new IsPrimeNumberResponseDTO();
        responseDTO.setIsPrimeNumber(isPrime);
        responseDTO.setTimeSpentInMillis(total);
        responseDTO.setFactor(isPrime ? null : optionalLong.getAsLong());
        return responseDTO;
    }
}
