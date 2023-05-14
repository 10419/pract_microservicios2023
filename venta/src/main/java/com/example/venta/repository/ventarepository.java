package com.example.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.venta.entity.venta;

public interface ventarepository extends JpaRepository<venta,Integer> {
    
}
