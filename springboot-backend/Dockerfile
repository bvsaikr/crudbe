FROM gcr.io/distroless/java:17
WORKDIR /app
COPY ./target/springboot-backend-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboot-backend-0.0.1-SNAPSHOT.jar"]
