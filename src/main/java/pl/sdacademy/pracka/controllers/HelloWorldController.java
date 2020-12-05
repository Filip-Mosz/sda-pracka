package pl.sdacademy.pracka.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sdacademy.pracka.services.HelloService;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloService helloService;

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        return helloService.fetchHelloMessage();
    }
}
