package ru.aslugin.punkmarket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping(value = "/products")
    public String getAllProducts() {
        return "Hello, you called getAllProducts!";
    }

    @GetMapping(value = "/product/{id}")
    public String getProduct(@PathVariable String id) {
        return "Hello, you called getProduct with id " + id;
    }
}
