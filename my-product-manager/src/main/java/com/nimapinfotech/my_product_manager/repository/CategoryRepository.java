package com.nimapinfotech.my_product_manager.repository;

import com.nimapinfotech.my_product_manager.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
