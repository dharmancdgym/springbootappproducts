package com.productapp.controller;

import java.util.List;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.model.Product;
import com.productapp.service.IProductService;



@RestController
public class ProductController {
	
	


    @Autowired
	private IProductService productService;

    @PostMapping
    public void addProduct(@RequestBody Product product) throws Exception {
    	productService.addProduct(product);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product product) throws Exception {
    	productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) throws Exception {
    	productService.deleteProduct(id);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) throws Exception {
        return productService.getById(id);
    }

    @GetMapping("/showprodcts")
    public List<Product> getAllProducts() throws Exception {
        return productService.getAll();
    }

}
