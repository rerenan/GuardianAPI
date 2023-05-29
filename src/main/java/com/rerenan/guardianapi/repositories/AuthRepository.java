package com.rerenan.guardianapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rerenan.guardianapi.model.Person;

public interface AuthRepository extends JpaRepository<Person, Long> {

}
