package com.rerenan.guardianapi.model;

import com.rerenan.guardianapi.dto.PersonDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

public class Person {
    public Person(PersonDTO data) {
        this.username = data.username();
        this.email = data.email();
        this.password = data.password();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 35, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 100, nullable = false)
    private String password;

}
