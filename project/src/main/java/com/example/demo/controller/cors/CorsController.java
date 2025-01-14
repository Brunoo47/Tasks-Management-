package com.example.demo.controller.cors;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CorsController {
    @GetMapping("/EntityTask")
    public ResponseEntity<List>EntityTask(){
        return ResponseEntity.ok().body(new ArrayList<>());
    }
@Configuration
    public class WebConfig implements WebMvcAutoConfiguration {
        @Override
    public void addCorsMappings(CorsRegistry registry);
}

}

