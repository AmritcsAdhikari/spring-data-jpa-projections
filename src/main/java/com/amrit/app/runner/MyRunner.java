package com.amrit.app.runner;

import com.amrit.app.entity.Product;
import com.amrit.app.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private ProductRepository repo;

    @Override
    public void run(String... args) throws Exception {

        List<Product> list = Arrays.asList(
                new Product(10,"MOUSE",150.00,"A"),
                new Product(11,"KEYBOARD",220.00,"A"),
                new Product(12,"PRINTER",550.00,"A"),
                new Product(13,"PANTS",35.00,"B"),
                new Product(14,"T-SHIRT",75.00,"B"),
                new Product(15,"BMW",80000.00,"C"),
                new Product(16,"MERCEDES",75000.00,"C")
        );
        repo.saveAll(list);

        List<Product> b = repo.findByProductCode("B");
        b.forEach(System.out::println);
    }
}
