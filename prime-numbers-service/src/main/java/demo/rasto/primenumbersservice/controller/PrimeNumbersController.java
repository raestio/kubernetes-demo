package demo.rasto.primenumbersservice.controller;

import demo.rasto.primenumbersservice.dto.IsPrimeNumberResponseDTO;
import demo.rasto.primenumbersservice.dto.PrimeNumbersResponseDTO;
import demo.rasto.primenumbersservice.service.impl.PrimeNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/api/v1")
public class PrimeNumbersController {

    @Autowired
    private PrimeNumbersService primeNumbersService;

    @GetMapping(value = "/is-prime-number", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<IsPrimeNumberResponseDTO> isPrimeNumber(@RequestParam("number") Long number) {
        IsPrimeNumberResponseDTO responseDTO = primeNumbersService.isPrimeNumber(number);
        return ResponseEntity.ok(responseDTO);
    }

    @GetMapping(value = "/first-n-prime-numbers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PrimeNumbersResponseDTO> getFirstNPrimeNumbers(@RequestParam("n") Long n) {
        PrimeNumbersResponseDTO responseDTO = primeNumbersService.getFirstNPrimeNumbers(n);
        return ResponseEntity.ok(responseDTO);
    }
}
