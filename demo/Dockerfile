# Stage 1: Build
FROM maven:3.9.0-openjdk-17 as build
WORKDIR /app

# Copy pom.xml and install dependencies
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Final Image
FROM openjdk:17-jdk-alpine

WORKDIR /app

# Copy only the necessary artifact from the build stage
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar

# Expose the application's port
EXPOSE 8080


# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/demo-0.0.1-SNAPSHOT.jar"]
