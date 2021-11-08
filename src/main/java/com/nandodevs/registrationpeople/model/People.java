package com.nandodevs.registrationpeople.model;

import com.nandodevs.registrationpeople.enums.Estados;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 60)
    private String name;

    @NotBlank
    @Size(max = 11)
    private String cpf;

    @NotBlank
    @Size(max = 255)
    @Email
    private String email;

    @NotBlank
    private String city;

    private Estados estados;

    @NotBlank
    @Size(max = 20)
    private String telefone;

}
