package io.vertx.example;

import io.vertx.core.Vertx;

public class HelloWorldEmbedded {

  public static void main(String[] args) {
    // Create an HTTP server which simply returns "Hello World!" to each request.
    Vertx.vertx()
      .createHttpServer()
      .requestHandler(req -> req.response().end("Hello World! - version 1"))
      .listen(8080, handler -> {
        if (handler.succeeded()) {
          System.out.println("http://localhost:8080/");
        } else {
          System.err.println("Failed to listen on port 8080");
        }
      });
  }

}
