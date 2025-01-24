package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table
public class Product {
    @Id
    @Min(1)
    private int productId;

    @NotNull
    @Size(min = 2, max = 100)
    private String productName;

    @Min(0)
    private int productPrice;

    @NotNull
    @Size(min = 2, max = 50)
    private String productCategory;

    @PastOrPresent
    private Date productValidaty;
}
