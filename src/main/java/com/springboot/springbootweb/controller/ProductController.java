package com.springboot.springbootweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springbootweb.model.Product;
import com.springboot.springbootweb.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id) {
        return service.getProduct(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        // System.out.println(product.toString());
        service.addProduct(product);
    }
    

}
