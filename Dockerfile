
FROM eclipse-temurin:21-jre-alpine
# FROM amazoncorretto:21
WORKDIR /app
EXPOSE 8282
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
