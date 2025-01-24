package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.exceptions.ProductNotFound;
import com.example.demo.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/products") // http://localhost:8081/products/save
@AllArgsConstructor
public class ProductController {

	ProductService service;

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

//	@RequestMapping(method = RequestMethod.POST, consumes = "application/json",value="/save")
	@PostMapping("/save")
	public String saveProduct(@RequestBody Product product) {
		logger.info("inside get All product...controller");
		return service.addProduct(product);
	}

	@PutMapping("/update") // http://localhost:8081/products/update
	public Product updateProduct(@RequestBody Product product) {
		logger.info("inside update product...controller");
		return service.updateProduct(product);
	}

	@DeleteMapping("/delete/{id}") // http://localhost:8081/delete/123
	public String deleteProduct(@PathVariable("id") int productId) {
		logger.info("inside delete product...controller");
		return service.deleteProduct(productId);
	}

	@GetMapping("/getById/{id}") // http://localhost:8081/getById/123
	public Product getProduct(@PathVariable("id") int ProductId) throws ProductNotFound {
		logger.info("inside get product By Id...controller");
		return service.getProductById(ProductId);
	}

	@GetMapping("/getAll") // http://localhost:8081/products/getAll
	public List<Product> getALlProducts() {
		logger.info("inside get All products...controller");
		return service.getALlProducts();
	}

	@GetMapping("/getBetween/{price1}/{price2}") // http://localhost:8081/products/getBetween/1000/2000
	public List<Product> getAllBetween(@PathVariable("price1") int initialPrice,
			@PathVariable("price2") int finalPrice) {
		logger.info("inside get between product...controller");
		return service.getALlProductBetween(initialPrice, finalPrice);
	}

	@GetMapping("/getByProductCategory/{category}") // http://localhost:8081/products//getByProductCategory/{category}
	public List<Product> getByproductCategory(@PathVariable("category") String productCategory) {
		logger.info("inside get between product...controller");
		return service.getByProductCategory(productCategory);
	}

	@GetMapping("/getByCategoryAndPriceLessThan/{category}/{Price}") // http://localhost:8081/products//getByProductCategory/{category}
	public List<Product> getByProductCategoryAndPriceLessThan(@PathVariable("category") String Category,
			@PathVariable("Price") int Price) {
		logger.info("inside get between product...controller");
		return service.getByProductCategoryAndProductPriceLessThan(Category, Price);
	}
}
