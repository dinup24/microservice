FROM openjdk:8
LABEL maintainer=dinup24

COPY build/libs/microservice-1.0.0-fat.jar /app/microservice-1.0.0-fat.jar
ENTRYPOINT ["java", "-jar", "/app/microservice-1.0.0-fat.jar"]
EXPOSE 8080