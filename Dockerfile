FROM eclipse-temurin:25.0.3_9-jdk-ubi10-minimal
COPY /target/employee-service-0.0.1-SNAPSHOT.jar emp-service.jar
ENTRYPOINT [ "java", "-jar", "emp-service.jar" ]