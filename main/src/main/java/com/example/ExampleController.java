package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.reactivex.Single;

@Controller("/example")
public class ExampleController {
  @Get
  @Produces(MediaType.TEXT_PLAIN)
  public Single<String> getExample() {
    return Single.just("Example");
  }
}
