package com.rerenan.guardianapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rerenan.guardianapi.dto.SystemDTO;
import com.rerenan.guardianapi.services.SystemService;

@RestController
@RequestMapping("/api/systems")

public class SystemController {
    @Autowired
    private SystemService systemService;

    @GetMapping("/all")
    public List<System> getAll(@RequestBody SystemDTO req) {
        return systemService.getAll(null);
    }
}
