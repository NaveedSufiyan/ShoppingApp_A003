package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;
import com.example.demo.exceptions.ProductNotFound;

public interface ProductService {

	public abstract String addProduct(Product product);

	public abstract Product updateProduct(Product product);

	public abstract String deleteProduct(int productId);

	public abstract Product getProductById(int productId) throws ProductNotFound;

	public abstract List<Product> getALlProducts();

	public abstract List<Product> getALlProductBetween(int initializePrice, int finalPrice);
	
	public abstract List<Product> getByProductCategory(String Category);

	public abstract List<Product> getByProductCategoryAndProductPriceLessThan(String Category, int Price);
}
