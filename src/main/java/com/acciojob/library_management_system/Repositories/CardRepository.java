package com.acciojob.library_management_system.Repositories;

import com.acciojob.library_management_system.Models.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard,Integer> {


}
