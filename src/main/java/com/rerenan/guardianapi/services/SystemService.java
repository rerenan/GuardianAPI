package com.rerenan.guardianapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rerenan.guardianapi.repositories.SystemRepository;

@Service
public class SystemService {
    @Autowired
    private SystemRepository systemRepository;

    public List<System> getAll(Long id) {
        return systemRepository.findAllByPerson(id);
    }
}
