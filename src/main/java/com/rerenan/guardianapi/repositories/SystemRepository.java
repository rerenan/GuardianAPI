package com.rerenan.guardianapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemRepository extends JpaRepository<System, Long> {
    List<System> findAllByPerson(Long id);
}
