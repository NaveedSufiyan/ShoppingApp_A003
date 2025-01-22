package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table
public class Product {
	@Id
	private int productid;
	private String productName;
	private int productPrice;
	private String producuctCategory;
	private Date productValidaty;
	

}
