package demo.rasto.datamanagementservice.service.impl;

import demo.rasto.datamanagementservice.dto.PrimeNumberDataDTO;
import demo.rasto.datamanagementservice.service.DataManagementService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataManagementServiceImpl implements DataManagementService {

    @Override
    public PrimeNumberDataDTO savePrimeNumberData(PrimeNumberDataDTO primeNumberDataDTO) {
        return null;
    }

    @Override
    public List<PrimeNumberDataDTO> getPrimeNumbersData() {
        return new ArrayList<>();
    }
}
