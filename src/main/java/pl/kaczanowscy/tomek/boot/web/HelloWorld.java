package pl.kaczanowscy.tomek.boot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Value("${hello}")
    private String hello;

    @RequestMapping("/")
    String home() {
        return hello;
    }

}