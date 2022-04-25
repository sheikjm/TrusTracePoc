package com.trus.trace.entity;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Container(containerName = "products")
@Data
public class Product implements Serializable {

    @Id
    private String productid;

    private String productName;

    private double price;

    @PartitionKey
    private String productCategory;
}
