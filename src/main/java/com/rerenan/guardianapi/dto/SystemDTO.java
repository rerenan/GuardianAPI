package com.rerenan.guardianapi.dto;

import com.rerenan.guardianapi.model.Person;

import jakarta.validation.constraints.NotBlank;

public record SystemDTO(
        @NotBlank String name,
        @NotBlank Person person) {

}
