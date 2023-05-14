package com.example.venta.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ventadetalle {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer ventadeId;
    private Double cantidad;
    private Double precio;
    private Integer productoId; 

    public ventadetalle() {
        this.cantidad = (double) 0;
        this.precio = (double) 0;
    }
}
