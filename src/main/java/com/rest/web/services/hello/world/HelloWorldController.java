package com.rest.web.services.hello.world;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello World!!";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World!!");
    }

    @GetMapping("/hello-world-bean-a/{a}/{b}")
    public HelloWorldBean helloWorldBean(@PathVariable int a, @PathVariable(name = "b") String bb){
        return new HelloWorldBean(bb, a);
    }
}
