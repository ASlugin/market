package ru.aslugin.punkmarket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(value = "/")
    public String getAllProducts() {
        return "Hello, you called getAllProducts!";
    }
}
