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
The microservice version is defined in `build.gradle`. Update the version to `version = '1.0.0'`  

**3. Build the microservice and create a new docker image**  
```
./gradlew shadowJar
docker build -t microservice:2.0.0 .
docker tag microservice:2.0.0 ${docker-id}/microservice:2.0.0
docker push ${docker-id}/microservice:2.0.0
```
