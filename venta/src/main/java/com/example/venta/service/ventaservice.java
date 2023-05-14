package com.example.venta.service;

import java.util.List;
import java.util.Optional;

import com.example.venta.entity.venta;

public interface ventaservice {
    public List<venta> list();

    public venta save(venta venta);

    public venta update(venta venta);

    public Optional<venta> listById(Integer Id);

    public void deleteById(Integer Id);
}
