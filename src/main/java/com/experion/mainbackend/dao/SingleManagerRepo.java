package com.experion.mainbackend.dao;

import com.experion.mainbackend.entity.SingleManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="*")
@RepositoryRestResource(collectionResourceRel = "manageradd",path = "managersadd")

public interface SingleManagerRepo extends JpaRepository<SingleManager,Long> {
}
