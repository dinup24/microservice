package io.vertx.example;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.core.http.HttpServerResponse;

public class HelloWorldEmbedded {

  public static void main(String[] args) {
	Router router = Router.router(Vertx.vertx());
	
	router.get("/api/greetings")
		.handler(rc -> {
		  HttpServerResponse response = rc.response();
		  response
			  .putHeader("content-type", "text/html")
			  .end("Hello World! - version 1");
		});
	
    // Create an HTTP server which simply returns "Hello World!" to each request.
    Vertx.vertx()
      .createHttpServer()
      .requestHandler(router::accept)
      .listen(8080, handler -> {
        if (handler.succeeded()) {
          System.out.println("http://localhost:8080/");
        } else {
          System.err.println("Failed to listen on port 8080");
        }
      });
  }

}
