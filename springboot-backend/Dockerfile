FROM openjdk:17.0.1-jdk-slim
WORKDIR /app
COPY ./target/springboot-backend-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboot-backend-0.0.1-SNAPSHOT.jar"]
