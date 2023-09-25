FROM openjdk:17-jdk-slim AS build
WORKDIR /app

COPY build/libs/customer-0.0.1-SNAPSHOT-plain.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]