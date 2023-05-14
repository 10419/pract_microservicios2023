package com.example.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.cliente.entity.cliente;

public interface clienterepository extends JpaRepository<cliente,Integer> {
}
