package com.rerenan.guardianapi.model;

import org.checkerframework.common.value.qual.MinLen;

import com.rerenan.guardianapi.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

public class User {
    public User(UserDTO data) {
        this.username = data.username();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 35, nullable = false)
    private String username;

    @Email
    @Column(length = 100, nullable = false)
    private String email;

    @Size(min = 5, max = 100)
    @Column(length = 100, nullable = false)
    private String password;

}
