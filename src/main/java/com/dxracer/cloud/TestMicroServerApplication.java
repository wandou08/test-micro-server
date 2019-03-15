package com.dxracer.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static javafx.scene.input.KeyCode.R;

@SpringBootApplication
public class TestMicroServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMicroServerApplication.class, args);
    }

    @RestController
    private class TestController {

        @GetMapping("/message/{message}")
        public String getById(@PathVariable String message) {
            return "This is a test message :" + message;
        }

    }
}
