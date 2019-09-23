package demo.rasto.datamanagementservice.configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import demo.rasto.datamanagementservice.constants.DataManagementServiceConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collection;
import java.util.List;

@Configuration
@EnableMongoRepositories(DataManagementServiceConstants.REPOSITORY_BASE_PACKAGE)
public class MongoDBConfiguration extends AbstractMongoClientConfiguration {

    @Value("${mongodb.database}")
    private String databaseName;

    @Value("${mongodb.connectionString}")
    private String connectionString;

    @Override
    public MongoClient mongoClient() {
        MongoClient mongoClient = MongoClients.create(connectionString);
        return mongoClient;
    }

    @Override
    protected String getDatabaseName() {
        return databaseName;
    }

    @Override
    protected Collection<String> getMappingBasePackages() {
        return List.of(DataManagementServiceConstants.ENTITY_BASE_MAPPING_PACKAGE);
    }
}
