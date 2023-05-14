package com.example.venta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.venta.entity.venta;
import com.example.venta.service.ventaservice;

@RestController
@RequestMapping("/venta")
public class ventacontroller {
    @Autowired
    private ventaservice vs;

    @GetMapping
    public ResponseEntity<List<venta>> list() {
        return ResponseEntity.ok().body(vs.list());
    }

    @PostMapping
    public  ResponseEntity<venta> save(@RequestBody venta venta) {
        return ResponseEntity.ok(vs.save(venta));
    }
    @PutMapping()
    public ResponseEntity<venta> update(@RequestBody venta venta) {
        return ResponseEntity.ok(vs.update(venta));
    }

    @GetMapping("/{id}")
    public ResponseEntity<venta> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(vs.listById(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        vs.deleteById(id);
        return "Deleted Successfully";
    }
}
