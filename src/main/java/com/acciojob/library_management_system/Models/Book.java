package com.acciojob.library_management_system.Models;


import com.acciojob.library_management_system.Enum.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    private String bookName;

    private Integer noOfPages;


    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private Boolean isIssued;

    @JoinColumn
    @ManyToOne
    private Author author;





}
