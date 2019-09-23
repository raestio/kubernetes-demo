package demo.rasto.datamanagementservice.repository;

import demo.rasto.datamanagementservice.entity.PrimeNumberData;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrimeNumberDataRepository extends MongoRepository<PrimeNumberData, String> {
}
