package com.example.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.catalogo.entity.category;

public interface categoryrepository extends JpaRepository<category,Integer>{
}
