package demo.rasto.datamanagementservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "prime_numbers_data")
public class PrimeNumberData {

    @Id
    private String id;
    private Long primeNumber;
    private Long timeSpentInMillis;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getPrimeNumber() {
        return primeNumber;
    }

    public void setPrimeNumber(Long primeNumber) {
        this.primeNumber = primeNumber;
    }

    public Long getTimeSpentInMillis() {
        return timeSpentInMillis;
    }

    public void setTimeSpentInMillis(Long timeSpentInMillis) {
        this.timeSpentInMillis = timeSpentInMillis;
    }
}
