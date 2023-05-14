package com.example.catalogo.service;

import java.util.List;
import java.util.Optional;

import com.example.catalogo.entity.category;

public interface categoryservice {
    public List<category> list();

    public category save(category category);

    public category update(category category);

    public Optional<category> listById(Integer Id);

    public void deleteById(Integer Id);
}
