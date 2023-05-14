package com.example.catalogo.service;

import java.util.List;
import java.util.Optional;

import com.example.catalogo.entity.producto;

public interface productoservice {
    public List<producto> list();

    public producto save(producto producto);

    public producto update(producto producto);

    public Optional<producto> listById(Integer id);

    public void deleteById(Integer id);
}
