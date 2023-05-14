package com.example.cliente.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer clienteId;
    private String DNI;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
}
