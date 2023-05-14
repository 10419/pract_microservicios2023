package com.example.venta.dto;

import lombok.Data;

@Data
public class producto {
    private Integer productoId;
    private String productoNombre;
    private category categoria;
}
