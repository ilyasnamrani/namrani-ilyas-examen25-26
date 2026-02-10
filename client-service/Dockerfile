FROM eclipse-temurin:17
LABEL mentainer = "namraniilyas@gmail.com"
WORKDIR /app
COPY target/client-service-0.0.1-SNAPSHOT.jar /app/client-service.jar
ENTRYPOINT ["java" , "-jar" , "client-service.jar"]