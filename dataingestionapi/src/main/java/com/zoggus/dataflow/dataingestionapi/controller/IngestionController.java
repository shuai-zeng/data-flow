package com.zoggus.dataflow.dataingestionapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngestionController {

    @GetMapping("/")
    public String index() {
        return "Hello World!";
    }
}
