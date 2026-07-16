package com.apache_sharding.entity;

package com.sharding.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data.*;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @Column(name = "product_id")
    private String productId;
    
    private String name;
    private String brand;
    private Double price;
}