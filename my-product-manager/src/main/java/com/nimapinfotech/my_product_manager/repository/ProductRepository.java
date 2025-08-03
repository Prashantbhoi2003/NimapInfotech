package com.nimapinfotech.my_product_manager.repository;

import com.nimapinfotech.my_product_manager.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
