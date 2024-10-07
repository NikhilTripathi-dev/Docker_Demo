package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "items")
public class Item {

    @Id
    private String id;
    private String name;
    private String description;
    private double price;
}

