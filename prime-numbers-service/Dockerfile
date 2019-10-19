FROM    openjdk:11
# To use docker build cache in future builds we run build of dependencies only first
COPY    ./pom.xml .
COPY    ./mvnw .
COPY    ./.mvn /.mvn
RUN     ./mvnw dependency:resolve
RUN     ./mvnw dependency:resolve-plugins
# Build from source files
COPY    . .
RUN     ./mvnw package -DskipTests
EXPOSE  8080
CMD     java -jar ./target/prime-numbers-service-0.0.1-SNAPSHOT.jar