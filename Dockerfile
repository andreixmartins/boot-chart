
FROM docker.io/library/eclipse-temurin:21-jdk
WORKDIR /app
EXPOSE 8282
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
