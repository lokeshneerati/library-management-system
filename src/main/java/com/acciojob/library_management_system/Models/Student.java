package com.acciojob.library_management_system.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity  //This is a description/reflection of a table
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    @Id
    private Integer studentId;

    private String name;

    private Integer age;

    private String branch;

    private String emailId;


}
