package com.example.venta.dto;

import lombok.Data;

@Data
public class cliente {
    private Integer clienteId;
    private String DNI;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
}
