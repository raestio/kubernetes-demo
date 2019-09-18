FROM    openjdk:11
COPY    . .
RUN     ./mvnw package
EXPOSE  8080
CMD     java -jar ./target/data-management-service-0.0.1-SNAPSHOT.jar