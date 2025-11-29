FROM openjdk:11-jre-slim
WORKDIR /app
COPY ./target/springboot-backend-0.0.1-SNAPSHOT.jar /app/
RUN apt-get update && \
    apt-get install -y openjdk-11-jre-headless && \
    rm -rf /var/lib/apt/lists/*
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboot-backend-0.0.1-SNAPSHOT.jar"]
