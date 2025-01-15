package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    @Id
    int id;
    String title;
    String author;
    String genre;
    String price;
    String description;

}
