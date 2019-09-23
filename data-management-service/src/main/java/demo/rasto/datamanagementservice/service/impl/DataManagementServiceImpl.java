package demo.rasto.datamanagementservice.service.impl;

import demo.rasto.datamanagementservice.dto.PrimeNumberDataDTO;
import demo.rasto.datamanagementservice.entity.PrimeNumberData;
import demo.rasto.datamanagementservice.repository.PrimeNumberDataRepository;
import demo.rasto.datamanagementservice.service.DataManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataManagementServiceImpl implements DataManagementService {

    @Autowired
    private PrimeNumberDataRepository primeNumberDataRepository;

    @Autowired
    private Converter<PrimeNumberData, PrimeNumberDataDTO> toDTO;

    @Autowired
    private Converter<PrimeNumberDataDTO, PrimeNumberData> toDocument;

    @Override
    public PrimeNumberDataDTO savePrimeNumberData(PrimeNumberDataDTO primeNumberDataDTO) {
        PrimeNumberData primeNumberData = toDocument.convert(primeNumberDataDTO);
        primeNumberData = primeNumberDataRepository.save(primeNumberData);
        return toDTO.convert(primeNumberData);
    }

    @Override
    public List<PrimeNumberDataDTO> getPrimeNumbersData() {
        List<PrimeNumberData> primeNumberData = primeNumberDataRepository.findAll();
        return primeNumberData.stream().map(p -> toDTO.convert(p)).collect(Collectors.toList());
    }
}
