package com.nimapinfotech.my_product_manager.service;

import com.nimapinfotech.my_product_manager.entity.Category;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Page<Category> getAllCategories(int page, int size);
    Category getCategoryById(Long id);
    Category createCategory(Category category);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
}
