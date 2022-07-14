package com.maryanto.dimas.example.discovery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExampleRestController {


    @Autowired
    private RestTemplate restTemplate;


    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/halo")
    public Map<String, Object> halo() {
        Map<String, Object> params = new HashMap<>();
        params.put("time", LocalDateTime.now());
        params.put("message", "Halo ini dari aplikasi springboot");
        params.put("port", serverPort);
        return params;
    }


    @GetMapping("/call")
    public String call() {
        return restTemplate.getForObject("http://springboot-discovery-service-example/api/call", String.class);
    }
}
