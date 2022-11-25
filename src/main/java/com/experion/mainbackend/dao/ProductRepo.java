package com.experion.mainbackend.dao;

import com.experion.mainbackend.entity.Product;
import com.experion.mainbackend.entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
@RepositoryRestResource(collectionResourceRel = "product",path = "managers")
public interface ProductRepo extends JpaRepository<Product,Long> {

    @CrossOrigin(origins = "*")
    @RepositoryRestResource(collectionResourceRel = "userprofile",path="user_profile")
    interface UserRegistrationRepo extends JpaRepository<UserRegistration,Long> {
    }
}
