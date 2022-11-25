package com.experion.mainbackend.dao;


import com.experion.mainbackend.entity.ChittyCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "chittyCategory", path = "chittyCategory")
public interface ChitCategoryRepository extends JpaRepository<ChittyCategory,Long> {
    Page<ChittyCategory> findBycategoryName(@Param("name") String categoryName, Pageable pageable);
}
