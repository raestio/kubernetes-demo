package demo.rasto.datamanagementservice.converter;

import demo.rasto.datamanagementservice.dto.PrimeNumberDataDTO;
import demo.rasto.datamanagementservice.entity.PrimeNumberData;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PrimeNumberDTOConverter implements Converter<PrimeNumberDataDTO, PrimeNumberData> {

    @Override
    public PrimeNumberData convert(PrimeNumberDataDTO source) {
        PrimeNumberData primeNumberData = new PrimeNumberData();
        primeNumberData.setPrimeNumber(source.getPrimeNumber());
        primeNumberData.setTimeSpentInMillis(source.getTimeSpentInMillis());
        return primeNumberData;
    }
}
