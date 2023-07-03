package com.amrit.app.repo;

import com.amrit.app.entity.Product;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    /*
    * --- No Projections---
    * select p1_0.product_id,p1_0.product_code,p1_0.product_name,p1_0.product_price from product p1_0 where p1_0.product_code=?
    * */
    // List<Product> findByProductCode(String prodCode);

    interface MyView{
        // copy from getter method (ReturnType and methodName())
        Integer getProductId();
        String getProductName();
        String getProductCode();
    }

    /*
     * --- No Projections---
     * select p1_0.product_id,p1_0.product_code,p1_0.product_name,p1_0.product_price from product p1_0 where p1_0.product_code=?
     * */
    // List<Product> findByProductCode(String prodCode);

    /*
     * --- Static Projections---
     * select p1_0.product_id,p1_0.product_code,p1_0.product_name,p1_0.product_price from product p1_0 where p1_0.product_code=?
     * */
    List<MyView> findByProductCode(String prodCode);
}
