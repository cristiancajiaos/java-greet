package com.example.javagreet.controller;

import com.example.javagreet.entity.Greet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {

  @GetMapping
  public ResponseEntity<Greet> getGreet() {
    Greet greet = new Greet("Hola, mundo!");
    return ResponseEntity.ok(greet);
  }

  @PostMapping
  public ResponseEntity<Greet> postGreet(@RequestBody Greet greet) {
    Greet newGreet = new Greet(greet.getMessage());
    return ResponseEntity.ok(newGreet);
  }

}
