package eu.petrvich.demo.demoop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoOpApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoOpApplication.class, args);
    }

}

@RestController
class MyRestController {

    @GetMapping
    @RequestMapping(path = "/")
    public String get() {
        return "App running";
    }

}
