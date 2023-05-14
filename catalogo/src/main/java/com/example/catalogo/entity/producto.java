package com.example.catalogo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class producto {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) 
   private Integer productoId;
   private String productoNombre;
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "category_id")
   @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
   private category categoria;
}



