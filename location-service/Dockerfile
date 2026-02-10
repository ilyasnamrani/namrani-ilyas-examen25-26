FROM eclipse-temurin:17
LABEL mentainer = "namraniilyas@gmail.com"
WORKDIR /app
COPY target/location-service-0.0.1-SNAPSHOT.jar /app/location-service.jar
ENTRYPOINT ["java" , "-jar" , "location-service.jar"]