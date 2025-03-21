package com.acciojob.library_management_system.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "author_info")
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer authorId;

    private String authorName;

    private Integer age;

    private Integer noOfBooks;

    private Double ratings;

    private String emailId;



}
