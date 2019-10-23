### Lab 5

**1. Create a new version of the microservice**  
Update the java class `src/main/java/io/vertx/example/HelloWorldEmbedded.java` to return **Hello World! - version 2** as API response.  

Copy the following contents to this class file.
```
package io.vertx.example;

import io.vertx.core.Vertx;

public class HelloWorldEmbedded {

  public static void main(String[] args) {
    // Create an HTTP server which simply returns "Hello World!" to each request.
    Vertx.vertx()
      .createHttpServer()
      .requestHandler(req -> req.response().end("Hello World! - version 2"))
      .listen(8080, handler -> {
        if (handler.succeeded()) {
          System.out.println("http://localhost:8080/");
        } else {
          System.err.println("Failed to listen on port 8080");
        }
      });
  }
}
```

**2. Update the version string**  
The microservice version is defined in `build.gradle`. Update the version to `version = '2.0.0'`  
Also update the `Dockerfile` with the following contents
```
FROM openjdk:8
LABEL maintainer=dinup24

COPY build/libs/microservice-2.0.0-fat.jar /app/microservice-2.0.0-fat.jar
ENTRYPOINT ["java", "-jar", "/app/microservice-2.0.0-fat.jar"]
EXPOSE 8080
```

**3. Build the microservice and create a new docker image**  
```
./gradlew shadowJar

docker build -t microservice:2.0.0 .

docker tag microservice:2.0.0 ${docker-id}/microservice:2.0.0

docker push ${docker-id}/microservice:2.0.0
```
