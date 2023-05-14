package com.example.venta.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.venta.dto.cliente;

@FeignClient(name = "cliente-service", path = "/cliente")
public interface clientefeing {
    @GetMapping("/{id}")
    public ResponseEntity<cliente> listById(@PathVariable(required = true) Integer id);
}
