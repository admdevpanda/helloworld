package com.devpanda.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam(required = false, defaultValue = "Stranger") String user) {
        return format("Hello, [%s]. Welcome to DevPanda |>'='<|", user);
    }

}
