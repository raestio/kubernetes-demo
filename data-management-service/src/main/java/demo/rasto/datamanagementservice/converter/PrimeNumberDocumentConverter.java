package demo.rasto.datamanagementservice.converter;

import demo.rasto.datamanagementservice.dto.PrimeNumberDataDTO;
import demo.rasto.datamanagementservice.entity.PrimeNumberData;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PrimeNumberDocumentConverter implements Converter<PrimeNumberData, PrimeNumberDataDTO> {

    @Override
    public PrimeNumberDataDTO convert(PrimeNumberData source) {
        PrimeNumberDataDTO dto = new PrimeNumberDataDTO();
        dto.setPrimeNumber(source.getPrimeNumber());
        dto.setTimeSpentInMillis(source.getTimeSpentInMillis());
        return dto;
    }
}
