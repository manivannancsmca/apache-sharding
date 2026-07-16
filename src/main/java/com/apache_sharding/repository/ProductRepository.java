package com.apache_sharding.repository;

import com.sharding.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    // ShardingSphere-ஐப் பயன்படுத்துவதால் கஸ்டம் குவரியோ ரூட்டிங் லாஜிக்கோ தேவையில்லை!
}
