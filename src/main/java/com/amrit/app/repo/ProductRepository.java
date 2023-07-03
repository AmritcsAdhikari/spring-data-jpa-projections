package com.amrit.app.repo;

import com.amrit.app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    List<Product> findByProductCode(String prodCode);
}
