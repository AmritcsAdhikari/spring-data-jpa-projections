package com.amrit.app.repo;

import com.amrit.app.entity.Product;
import lombok.Getter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    interface MyView{
        // copy from getter method (ReturnType and methodName())
        Integer getProductId();
        String getProductName();
        String getProductCode();
    }
    interface MyViewTwo{
        // copy from getter method (ReturnType and methodName())
        String getProductName();
        String getProductPrice();
    }

    /*
     * --- No Projections---
    List<Product> findByProductCode(String prodCode); */

    /*
     * --- Static Projections---*/
    List<MyView> findByProductCode(String prodCode);

    /*
     * --- Dynamic Projections---*/
    <T> List<T> findByProductCode(String prodCode, Class<T>clz);
}
