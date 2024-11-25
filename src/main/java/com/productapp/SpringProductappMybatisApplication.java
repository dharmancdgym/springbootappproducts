package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}

//	@Autowired
//	private IProductService productService;
//	@Override
	
/*	public void run(String... args) throws Exception {
		Product product = new Product("Laptop",900000,"Dell","Tech");
	productService.addProduct(product);
	Product product1 = new Product("Mobile",20000,"Samsung","Gadgets");
		productService.addProduct(product1);
		Product product2 = new Product("Camera",20000,"Nikon","Gadgets");
		productService.addProduct(product2);
	
		
		Product product = new Product("headphone",2000,"boss","Tech");
		productService.addProduct(product);
		
		productService.getAll();
		productService.getByLesserPrice(30000).forEach(System.out::println);
		
	}
*/

}
