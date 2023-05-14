package com.example.venta.entity;

import com.example.venta.dto.producto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
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
    @Transient
    private producto producto;
    public ventadetalle() {
        this.cantidad = (double) 0;
        this.precio = (double) 0;
    }
}
