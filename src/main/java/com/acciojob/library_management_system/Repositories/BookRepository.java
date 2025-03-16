package com.acciojob.library_management_system.Repositories;

import com.acciojob.library_management_system.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
