package com.example.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

public class User {

    @Id
    int id;
    String username;
    String email;
    String password;

}
