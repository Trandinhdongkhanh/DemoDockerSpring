# Use a base image with Java 17
FROM openjdk:17

WORKDIR /app

# Copy the JAR package into the image
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /app/app.jar

# Run the App
ENTRYPOINT ["java", "-jar", "app.jar"]