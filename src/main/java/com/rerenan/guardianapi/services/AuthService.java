package com.rerenan.guardianapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rerenan.guardianapi.model.Person;
import com.rerenan.guardianapi.repositories.AuthRepository;

@Service
public class AuthService {
    @Autowired
    private AuthRepository personRepository;

    public Person create(Person data) {
        return personRepository.save(data);
    }
}
