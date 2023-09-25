package com.java.springbootcrudexample.controller;

import com.java.springbootcrudexample.entity.Product;
import com.java.springbootcrudexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;


    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProduct(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    @GetMapping("/allProducts")
    public List<Product> findByProducts() {
        return productService.getProducts();
    }

    @GetMapping("/product/id/{id}")
    public Product findByProductId(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findByProductName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @GetMapping("/product/idAndName")
    public List<Product> findByIDAndName(@RequestParam int id, @RequestParam String name) {
        return productService.getProductByIdAndName(id, name);
    }

    @GetMapping("/quantity")
    public List<Product> findByQuantity(@RequestParam int quantity) {
        return productService.getQuantity(quantity);
    }


    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }
}
