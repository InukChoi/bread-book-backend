package com.example.breadbook.domain.product.repository;

import com.example.breadbook.domain.product.model.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
}
