package com.example.springboot_application.Product.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(name = "product_name")
    public String name;

    private String  description;

    @Column(name="image_Url")
    private String  imageUrl;
    private Integer stock_quantity;
    private double  product_price;
    private double  gst_percentage;
}
