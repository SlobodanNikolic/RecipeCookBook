package com.nameksoft.domaci3.repositiories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.nameksoft.domaci3.models.ApplicationUser;
import com.nameksoft.domaci3.models.Recipe;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, String> {
    @Override
    Optional<ApplicationUser> findById(String id);

    @Override
    void delete(ApplicationUser deleted);
    
    ApplicationUser findByUsername(String username);
}
