package com.example.venta.service.impl;

import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.venta.dto.cliente;
import com.example.venta.dto.producto;
import com.example.venta.entity.venta;
import com.example.venta.entity.ventadetalle;
import com.example.venta.feing.clientefeing;
import com.example.venta.feing.productofeing;
import com.example.venta.repository.ventarepository;
import com.example.venta.service.ventaservice;

@Service
public class ventaserviceimpl implements ventaservice {
    @Autowired
    private ventarepository vr;

    @Autowired
    private clientefeing cf;

    @Autowired
    private productofeing pf;

    @Override
    public List<venta> list() {
        return vr.findAll();
    }    

    @Override
    public venta save(venta venta) {
        return vr.save(venta);
    }
    
    @Override
    public venta update(venta venta) {
        return vr.save(venta);
    }

    @Override
    public Optional<venta> listById(Integer Id) {
        venta venta=vr.findById(Id).get();
        cliente cliente = cf.listById(venta.getClienteId()).getBody();
        List<ventadetalle> VentaDetalle= venta.getDetalle().stream().map(ventadetalle -> {
            producto producto = pf.listById(ventadetalle.getProductoId()).getBody();
            System.out.println(producto.toString());
            System.out.println(producto.getProductoNombre());
            ventadetalle.setProducto(producto);
            return ventadetalle;
        }).collect(Collectors.toList());
        venta.setDetalle(VentaDetalle);
        venta.setCliente(cliente);
        return Optional.of(venta);
    }

    @Override
    public void deleteById(Integer Id) {
        vr.deleteById(Id);
    }
}
