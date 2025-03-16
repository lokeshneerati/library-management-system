package com.acciojob.library_management_system.Repositories;

import com.acciojob.library_management_system.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {


}
