package com.rerenan.guardianapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record PersonDTO(
                @NotBlank String username,
                @NotBlank @Email String email,
                @NotBlank String password) {

}
