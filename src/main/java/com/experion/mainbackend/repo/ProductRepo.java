package com.experion.mainbackend.repo;

import com.experion.mainbackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//@CrossOrigin(origins="*")
public interface ProductRepo extends JpaRepository<Product,Long> {
}
