package com.example.catalogo.service.impl;

import com.example.catalogo.entity.producto;
import com.example.catalogo.repository.productorepository;
import com.example.catalogo.service.productoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class productoserviceimpl implements productoservice {
    @Autowired
    private productorepository pr;

    @Override
    public List<producto> list() {
        return pr.findAll();
    }

    @Override
    public producto save(producto producto) {
        return pr.save(producto);
    }

    @Override
    public producto update(producto producto) {
        return pr.save(producto);
    }

    @Override
    public Optional<producto> listById(Integer id) {
        return pr.findById(id);
    }

    @Override
    public void deleteById(Integer id) {
        pr.deleteById(id);
    }

}