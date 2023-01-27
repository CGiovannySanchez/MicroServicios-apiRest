package com.giovanny.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giovanny.product.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Long> {

}
