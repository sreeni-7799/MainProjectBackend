package com.experion.mainbackend.dao;

import com.experion.mainbackend.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
@RepositoryRestResource(collectionResourceRel = "product",path = "managers")
public interface ProductRepo extends JpaRepository<Product,Long> {
    Page<Product> findByfirstNameContaining(@Param("name") String firstName, Pageable pageable);

}
