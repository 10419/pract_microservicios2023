package com.example.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.catalogo.entity.producto;

public interface productorepository extends JpaRepository<producto,Integer>{
}
