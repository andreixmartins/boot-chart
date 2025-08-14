
# FROM eclipse-temurin:21-jre-alpine
FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
EXPOSE 8282
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
